package view;

import javax.swing.*;
import java.awt.*;
import java.nio.file.attribute.UserPrincipalNotFoundException;

public class MenuItemPanel extends JPanel {

    private JButton add_taco_button;
    private JButton add_coke_button;

    public MenuItemPanel(){
//        super(new BorderLayout());
        this.setName( "MenuItemPanel" );

        this.add_coke_button = new JButton();
        this.add_coke_button.setName( "AddCokeButton" );
        this.add_coke_button.setText( "Coke" );

        this.add_taco_button = new JButton();
        this.add_taco_button.setName( "AddTacoButton" );
        this.add_taco_button.setText( "Taco" );

        this.add( this.add_coke_button );
        this.add( this.add_taco_button );

    }


    public JButton getAddCokeButton() {
        return this.add_coke_button;
    }

    public JButton getAddTacoButton() {
        return this.add_taco_button;
    }
}
