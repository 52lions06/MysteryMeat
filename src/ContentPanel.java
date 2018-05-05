import javax.swing.*;

public class ContentPanel extends JPanel {

    private CustomerNamePanel customerNamePanel;

    public ContentPanel(){
        this.setName("ContentPanel");
        customerNamePanel = new CustomerNamePanel();
        this.add(customerNamePanel);
    }

    public CustomerNamePanel getCustomerNamePanel() {
        return customerNamePanel;
    }
}
