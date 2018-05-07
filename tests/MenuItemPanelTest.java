import org.junit.Before;
import org.junit.Test;

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
        assertEquals("AddCokeButton", add_coke_button.getName());
        assertEquals("Coke", add_coke_button.getText());
    }

}