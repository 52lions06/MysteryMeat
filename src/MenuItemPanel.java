import javax.swing.*;
import java.awt.*;
import java.nio.file.attribute.UserPrincipalNotFoundException;

public class MenuItemPanel extends JPanel {

    private JButton add_coke_button;

    public MenuItemPanel(){
//        super(new BorderLayout());
        this.setName("MenuItemPanel");

        add_coke_button = new JButton();
        add_coke_button.setName("AddCokeButton");
        add_coke_button.setText("Coke");

        this.add(add_coke_button);

    }


    public JButton getAddCokeButton() {
        return add_coke_button;
    }
}
