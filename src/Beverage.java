public abstract class Beverage extends ConsumableItem {

    private boolean isDiet = false;

    private Ice iceChoice;

    public Beverage(double price) {
        super(price);
    }

    //diet type getter
    public boolean isDiet() {
        return isDiet;
    }

    public void setDiet(boolean diet){
        this.isDiet = diet;
        setItemDisplayName(getItemDisplayName()+ " (Diet)");

    }

    public void setIceChoice(Ice iceChoice) {
        this.iceChoice = iceChoice;
        setItemDisplayName(getItemDisplayName()+" ("+iceChoice.toString()+")");
    }

    public Ice getIceChoice(){
        return this.iceChoice;
    }
}
