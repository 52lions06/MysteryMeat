public abstract class ConsumableItem {

    private double unitPrice;

    private String itemName;

    public ConsumableItem(double price){
        this.unitPrice = price;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(double price) {
        this.unitPrice = price;

    }

    public void setItemName(String name){
        this.itemName = name;

    }

    public String getItemName(){
        return this.itemName;
    }
}
