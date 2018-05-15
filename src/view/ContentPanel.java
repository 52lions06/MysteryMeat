package view;

import javax.swing.*;
import java.awt.*;

public class ContentPanel extends JPanel {

    private CustomerNamePanel customerNamePanel;

    private OrderDisplayPanel orderDisplayPanel;
    private MenuItemPanel menuItemPanel;

    public ContentPanel(){
        super( new BorderLayout() );

        this.setName( "ContentPanel" );

        this.customerNamePanel = new CustomerNamePanel();
        this.menuItemPanel = new MenuItemPanel();
        this.orderDisplayPanel = new OrderDisplayPanel();

        orderDisplayPanel.setLayout( new BoxLayout(orderDisplayPanel, BoxLayout.PAGE_AXIS));

        this.add( customerNamePanel, BorderLayout.PAGE_START );
        this.add( menuItemPanel, BorderLayout.LINE_START );
        this.add( orderDisplayPanel, BorderLayout.LINE_END );
    }

    public CustomerNamePanel getCustomerNamePanel() {
        return customerNamePanel;
    }

    public MenuItemPanel getMenuItemPanel() {
        return menuItemPanel;
    }

    public OrderDisplayPanel getOrderDisplayPanel() {
        return orderDisplayPanel;
    }
}
