import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class CustomerNamePanelTest {

    private CustomerNamePanel panel;

    @Before
    public void setUp(){
        panel = new CustomerNamePanel();

    }

    @Test
    public void testNamePanelIsValid(){
        assertEquals("CustomerNamePanel", panel.getName());
    }

    @Test
    public void testNameLabelIsValid(){
        JLabel customer_name_label = (JLabel) panel.getComponents()[0];
        assertEquals("CustomerNameLabel", customer_name_label.getName());
        assertEquals("Enter Customer Name", customer_name_label.getText());
    }

}