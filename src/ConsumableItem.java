public abstract class ConsumableItem {

    private double unitPrice;

    private String itemDisplayName;


    public ConsumableItem(double price){
        this.unitPrice = price;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(double price) {
        this.unitPrice = price;

    }

    public void setItemDisplayName(String name){
        this.itemDisplayName = name;

    }

    public String getItemDisplayName(){
        return this.itemDisplayName;
    }


}
