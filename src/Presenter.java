import javax.swing.*;

public class Presenter {

    private MysteryMeatFrame presenterFrame;
    private CustomerNamePanel presenterPanel;

        public Presenter(MysteryMeatFrame mysteryMeatFrame) {
        this.presenterFrame = mysteryMeatFrame;
        presenterPanel = new CustomerNamePanel();
        mysteryMeatFrame.setContentPane(presenterPanel);
        mysteryMeatFrame.revalidate();
    }

    public MysteryMeatFrame getFrame() {
        return this.presenterFrame;
    }

    public JPanel getCurrentScreen() {
        return this.presenterPanel;
    }

    public static void main(String[] args) {
        new Presenter(new MysteryMeatFrame());
    }
}
