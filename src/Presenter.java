import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presenter {

    private MysteryMeatFrame presenterFrame;

    private ContentPanel contentPanel;

    private Order order;

        public Presenter(MysteryMeatFrame mysteryMeatFrame) {
        this.presenterFrame = mysteryMeatFrame;
        contentPanel = new ContentPanel();
        mysteryMeatFrame.setContentPane(contentPanel);
        contentPanel.getCustomerNamePanel().getCustomer_name_button().addActionListener(new CustomerNameButtonActionListener());

        mysteryMeatFrame.revalidate();
    }

    public MysteryMeatFrame getFrame() {
        return this.presenterFrame;
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

    private class CustomerNameButtonActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String customer_name = ((ContentPanel) getContentPanel()).getCustomerNamePanel().getCustomer_name_TextField().getText();
            setOrder(new Order(customer_name));
            System.out.println(getOrder().getCustomerName());
        }
    }

    public static void main(String[] args) {
        new Presenter(new MysteryMeatFrame());
    }
}
