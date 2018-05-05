import javax.swing.*;

public class MysteryMeatFrame extends JFrame {

    public MysteryMeatFrame(){
        this.setName("MMFrame");
        this.setTitle("Mystery Meat");
        this.setSize(800,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(new CustomerNamePanel());
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MysteryMeatFrame();
    }
}
