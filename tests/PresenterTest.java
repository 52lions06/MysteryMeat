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

    @Test
    public void testCustomerNameGoButtonCreatesOrderWithCustomerName(){
        Presenter presenter = new Presenter(new MysteryMeatFrame());
        String john_carter = "John Carter";
        ((CustomerNamePanel) presenter.getCurrentScreen()).getCustomer_name_TextField().setText(john_carter);
        ((CustomerNamePanel) presenter.getCurrentScreen()).getCustomer_name_button().doClick();
        assertEquals(john_carter, presenter.getOrder().getCustomerName());
    }



}