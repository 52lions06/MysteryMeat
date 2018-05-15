package view;

import org.junit.Test;
import view.ContentPanel;

import static org.junit.Assert.*;

public class ContentPanelTest {

    @Test
    public void testContentPanelHasCustomerNamePanel(){
        ContentPanel contentPanel = new ContentPanel();
        assertEquals("CustomerNamePanel", contentPanel.getComponents()[0].getName());
    }

    @Test
    public void testContentPanelHasMenuItemPanel(){
        ContentPanel contentPanel = new ContentPanel();
        assertEquals("MenuItemPanel", contentPanel.getComponents()[1].getName());
    }

}