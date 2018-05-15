package presenter;

import model.*;
import view.ContentPanel;
import view.MysteryMeatFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Presenter {

    private MysteryMeatFrame frame;

    private ContentPanel contentPanel;

//    Will need to support multiple orders going forward
    private Order order;

    public Presenter( MysteryMeatFrame mysteryMeatFrame ) {
        this.frame = mysteryMeatFrame;
        this.contentPanel = new ContentPanel();

        this.frame.setContentPane( contentPanel );

        this.contentPanel
                .getCustomerNamePanel()
                .getCustomer_name_button()
                .addActionListener( new CustomerNameButtonActionListener() );

        this.contentPanel
                .getMenuItemPanel()
                .getAddCokeButton()
                .addActionListener( new MenuButtonActionListener() );

        this.contentPanel
                .getMenuItemPanel()
                .getAddTacoButton()
                .addActionListener( new MenuButtonActionListener() );

        mysteryMeatFrame.revalidate();
    }

    public MysteryMeatFrame getFrame() {
        return this.frame;
    }

    public JPanel getContentPanel() {
        return this.contentPanel;
    }

    public Order getOrder() {
            return this.order;
    }

    public void setOrder(Order order) {
            this.order = order;
    }


    private void addItemToOrder( String menuItemName ) {
        ConsumableItem item_to_add = null;

        switch (menuItemName) {
            case "Coke": item_to_add = new Coke(); break;
            case "Taco": item_to_add = new Taco(); break;
        }

        if( item_to_add == null ) return;


        if ( getOrder() == null ) {
            String customer_name = ((ContentPanel) getContentPanel())
                    .getCustomerNamePanel()
                    .getCustomer_name_TextField()
                    .getText();

            setOrder( new Order( customer_name ) );
        }

        getOrder().addItem( item_to_add );

        ArrayList<ConsumableItem> orderItems = new ArrayList<>();
        ArrayList<String> itemLines = new ArrayList<>();
        for( int index = 0; index < getOrder().getOrderSize(); index++ ) {
            orderItems.add( getOrder().getItem( index ) );
        }

        for( int index = 0; index < orderItems.size(); index++ ) {
            ConsumableItem item = orderItems.get( index );
            int quantity = 1;

            for( int inner_index = index + 1; inner_index < orderItems.size(); inner_index++ ) {
                if( orderItems.get( index ).getItemDisplayName() == orderItems.get( inner_index ).getItemDisplayName() ) {
                    quantity++;
                    orderItems.remove( inner_index );
                    inner_index--;
                }
            }

            itemLines.add( item.getItemDisplayName() + "     " + quantity + "     " + item.getUnitPrice() + "     " + quantity * item.getUnitPrice() );
        }

        ( (ContentPanel) getContentPanel() )
                .getOrderDisplayPanel()
                .setItems( itemLines );

    }


    private class CustomerNameButtonActionListener implements ActionListener{
        @Override
        public void actionPerformed( ActionEvent e ) {
            String customer_name = ( (ContentPanel) getContentPanel() )
                    .getCustomerNamePanel()
                    .getCustomer_name_TextField()
                    .getText();


            if( getOrder() == null ) {
                setOrder( new Order( customer_name ) );
            } else {
                getOrder().setCustomerName( customer_name );
            }

            ( (ContentPanel) getContentPanel() )
                    .getOrderDisplayPanel()
                    .setCustomerName( customer_name );
        }
    }

    private class MenuButtonActionListener implements ActionListener{
        @Override
        public void actionPerformed( ActionEvent e ) {
            addItemToOrder( ( (JButton) e.getSource() ).getText() );
        }
    }

    public static void main( String[] args ) {
        new Presenter(new MysteryMeatFrame());
    }
}
