import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class MysteryMeatFrameTest {

    @Test
    public void testIfFrameIsValid(){
        MysteryMeatFrame frame = new MysteryMeatFrame();
        assertEquals("MMFrame", frame.getName());
        assertEquals("Mystery Meat",frame.getTitle());
        assertTrue(frame.isVisible());
        assertEquals(800, frame.getWidth());
        assertEquals(600, frame.getHeight());
        assertEquals(JFrame.EXIT_ON_CLOSE, frame.getDefaultCloseOperation());
    }

    @Test
    public void testHasCustomerNamePanel(){
        MysteryMeatFrame frame = new MysteryMeatFrame();
        ContentPanel contentPanel = new ContentPanel();
        frame.setContentPane(contentPanel);
        assertEquals("CustomerNamePanel",contentPanel.getCustomerNamePanel().getName());

    }

}