import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PresenterTest {

    public Presenter presenter;

    @Before
    public void setup(){
        presenter = new Presenter(new MysteryMeatFrame());
    }

    @Test
    public void testPresenterHasMMFrame(){
        MysteryMeatFrame mysteryMeatFrame = new MysteryMeatFrame();
        Presenter presenter = new Presenter(mysteryMeatFrame);
        assertEquals(mysteryMeatFrame, presenter.getFrame());
    }

    @Test
    public void testPresenterHasContentPanelAsDefault(){
        assertEquals("ContentPanel", presenter.getContentPanel().getName());
    }

    @Test
    public void testContentPanelHasCustomerNamePanel(){
        assertEquals("CustomerNamePanel",((ContentPanel) presenter.getContentPanel()).getCustomerNamePanel().getName());
    }

    @Test
    public void testCustomerNameGoButtonCreatesOrderWithCustomerName(){
        String john_carter = "John Carter";
        ((ContentPanel) presenter.getContentPanel()).getCustomerNamePanel().getCustomer_name_TextField().setText(john_carter);
        ((ContentPanel) presenter.getContentPanel()).getCustomerNamePanel().getCustomer_name_button().doClick();
        assertEquals(john_carter, presenter.getOrder().getCustomerName());
    }

    @Test
    public void testpresenterHasMenuItemsPanel(){
        assertEquals("MenuItemPanel", ((ContentPanel) presenter.getContentPanel()).getMenuItemPanel().getName());
    }

    @Test
    public void testCokeButtonAddsCokeToTheOrder(){
        ((ContentPanel) presenter.getContentPanel()).getCustomerNamePanel().getCustomer_name_button().doClick();
        ((ContentPanel) presenter.getContentPanel()).getMenuItemPanel().getAddCokeButton().doClick();
        assertEquals(1, presenter.getOrder().getOrderSize());

//        assertEquals(Class<Coke, presenter.getOrder().getItem(0).getClass());
        assertTrue(presenter.getOrder().getItem(0) instanceof Coke);


    }

}