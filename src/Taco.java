public class Taco extends ConsumableItem{
    private boolean hasGuacamole = false;

    public Taco() {
        super(3.0);
        setItemDisplayName("Taco");
    }


    public boolean hasGuacamole() {
        return this.hasGuacamole;
    }

    public void addGuacamole() {
        this.hasGuacamole = true;
        this.setUnitPrice(this.getUnitPrice()+ .75);
        setItemDisplayName(getItemDisplayName()+ " (Guac)");
    }
}
