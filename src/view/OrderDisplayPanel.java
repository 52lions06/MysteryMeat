package view;

import model.Order;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class OrderDisplayPanel extends JPanel {

    private String customerName;

    private ArrayList<String> itemLines;


    public OrderDisplayPanel(){
        this.customerName = new String();
        this.itemLines = new ArrayList<>();

        this.setName( "OrderDisplayPanel" );
        this.paint();
    }


    public void setCustomerName( String name ) {
        this.customerName = name;
        this.paint();
    }

    public void addItem( String itemLine ) {
        this.itemLines.add( itemLine );
        this.paint();
    }

    public void setItems(ArrayList<String> itemLines) {
        this.itemLines = itemLines;
        this.paint();
    }

    private void clear() {
        this.removeAll();
        this.repaint();
    }

    private void paint() {
        this.clear();

        this.add( new JLabel("Order for : " + ( this.customerName.isEmpty() ? "" : this.customerName ) ) );
        this.add( new JLabel( "Item     Qty.     Unit.     Price.     " ) );

        for( int index = 0; index < this.itemLines.size(); index++ ) {
            this.add(
                    new JLabel( this.itemLines.get( index ) )
            );
        }

        this.revalidate();
    }

}
