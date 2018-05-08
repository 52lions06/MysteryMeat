import javax.swing.*;
import java.awt.*;

public class ContentPanel extends JPanel {

    private CustomerNamePanel customerNamePanel;
    private  MenuItemPanel menuItemPanel;
    private OrderDisplayPanel orderDisplayPanel;

    public ContentPanel(){
        super(new BorderLayout());
        this.setName("ContentPanel");
        customerNamePanel = new CustomerNamePanel();
        this.add(customerNamePanel, BorderLayout.PAGE_START);
        menuItemPanel = new MenuItemPanel();
        this.add(menuItemPanel, BorderLayout.LINE_START);
        orderDisplayPanel = new OrderDisplayPanel();
        this.add(orderDisplayPanel, BorderLayout.LINE_END);
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
