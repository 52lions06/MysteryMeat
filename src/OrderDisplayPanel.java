import javax.swing.*;
import java.lang.reflect.Array;
import java.security.KeyStore;
import java.util.ArrayList;

public class OrderDisplayPanel extends JPanel {

    private ArrayList<JLabel> DisplayConsumableItems = new ArrayList<>();

    public OrderDisplayPanel(){
        this.setName("OrderDisplayPanel");
    }

    public ArrayList<JLabel> getListOfItems() {
        return this.DisplayConsumableItems;
    }

    public void updateOrderDisplay(Order order) {
        for(int itemIndex =0; itemIndex<order.getOrderSize();itemIndex++)
              {
                  this.add(new JLabel(order.getItem(itemIndex).getItemName()))

        }
    }
}
