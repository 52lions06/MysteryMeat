import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.nio.file.attribute.UserPrincipalNotFoundException;

public class ContentPanel extends JPanel {

    private CustomerNamePanel customerNamePanel;
    private  MenuItemPanel menuItemPanel;

    public ContentPanel(){
        super(new BorderLayout());
        this.setName("ContentPanel");
        customerNamePanel = new CustomerNamePanel();
        this.add(customerNamePanel, BorderLayout.PAGE_START);
        menuItemPanel = new MenuItemPanel();
        this.add(menuItemPanel, BorderLayout.LINE_START);
    }

    public CustomerNamePanel getCustomerNamePanel() {
        return customerNamePanel;
    }

    public MenuItemPanel getMenuItemPanel() {
        return menuItemPanel;
    }
}
