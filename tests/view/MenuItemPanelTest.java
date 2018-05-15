package view;

import org.junit.Before;
import org.junit.Test;
import view.MenuItemPanel;

import javax.swing.*;

import static org.junit.Assert.*;

public class MenuItemPanelTest {

    private MenuItemPanel panel;


    @Before
    public void setUp(){
        panel = new MenuItemPanel();

    }

    @Test
    public void testNamePanelIsValid(){
        assertEquals("MenuItemPanel", panel.getName());
    }


    @Test
    public void testNameButtonIsValid(){
        JButton add_coke_button = (JButton) panel.getComponents()[0];
        JButton add_taco_button = (JButton) panel.getComponents()[1];

        assertEquals("AddCokeButton", add_coke_button.getName());
        assertEquals("Coke", add_coke_button.getText());

        assertEquals("AddTacoButton", add_taco_button.getName());
        assertEquals("Taco", add_taco_button.getText());
    }

    @Test
    public void testCanRetrieveButtons() {
        JButton coke_button = (JButton) panel.getComponents()[ 0 ];
        JButton taco_button = (JButton) panel.getComponents()[ 1 ];

        assertEquals( coke_button, panel.getAddCokeButton() );
        assertEquals( taco_button, panel.getAddTacoButton() );
    }

}