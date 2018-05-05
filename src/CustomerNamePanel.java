import javax.swing.*;

public class CustomerNamePanel extends JPanel {

    private JLabel customer_name_label;
    private JTextField customer_name_textfield;
    private JButton customer_name_button;
    public CustomerNamePanel(){
        customer_name_label = new JLabel("Enter Customer Name");
        customer_name_label.setName("CustomerNameLabel");

        customer_name_textfield = new JTextField();
        customer_name_textfield.setName("CustomerTextField");
        customer_name_textfield.setColumns(15);

        customer_name_button = new JButton();
        customer_name_button.setName("CustomerNameButton");
        customer_name_button.setText("Go");

        this.setName("CustomerNamePanel");
        this.add(customer_name_label);
        this.add(customer_name_textfield);
        this.add(customer_name_button);

    }


}
