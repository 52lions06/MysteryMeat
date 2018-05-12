import javax.swing.*;
import java.util.ArrayList;

public class OrderDisplayPanel extends JPanel {

    private ArrayList<JLabel> DisplayConsumableItems = new ArrayList<>();


    public OrderDisplayPanel(){
        this.setName("OrderDisplayPanel");
        this.add(new JLabel("Order for : "));
        this.add(new JLabel("ITEM (Options)     Qty.     Unit.     Price."));
    }

    public ArrayList<JLabel> getListOfItems() {
        return this.DisplayConsumableItems;
    }

    public void updateOrderDisplay(Order order) {
        this.removeAll();
        this.add(new JLabel("Order for : "+order.getCustomerName()));
        this.add(new JLabel("ITEM (Options)     Qty.     Unit.     Price."));

        Order tempOrder = order;

        for(int itemIndex =0; itemIndex<tempOrder.getOrderSize();itemIndex++) {
            String itemDisplayName = tempOrder.getItem(itemIndex).getItemDisplayName();
            int qtyCount = 1;
            double unitPrice = tempOrder.getItem(itemIndex).getUnitPrice();
            double qtyXUnitPrice = tempOrder.getItem(itemIndex).getUnitPrice();
            for (int innerItemIndex =1; innerItemIndex<tempOrder.getOrderSize();innerItemIndex++){
                if (itemDisplayName == tempOrder.getItem(innerItemIndex).getItemDisplayName()){
                    qtyCount++;
                    qtyXUnitPrice+=tempOrder.getItem(innerItemIndex).getUnitPrice();
                    tempOrder.removeItem(innerItemIndex);
                }
            }
            this.add(new JLabel(tempOrder.getItem(itemIndex).getItemDisplayName()+ "     " + qtyCount + "     " + unitPrice + "     " + qtyXUnitPrice));

        }

    }

}
