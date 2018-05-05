import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class PresenterTest {

    @Test
    public void testPresenterHasMMFrame(){
        MysteryMeatFrame mysteryMeatFrame = new MysteryMeatFrame();
        Presenter presenter = new Presenter(mysteryMeatFrame);
        assertEquals(mysteryMeatFrame, presenter.getFrame());
    }

    @Test
    public void testPresenterHasCustomerNamePanel(){
        MysteryMeatFrame mysteryMeatFrame = new MysteryMeatFrame();
        Presenter presenter = new Presenter(mysteryMeatFrame);
        assertEquals("CustomerNamePanel",presenter.getCurrentScreen().getName());
    }



}