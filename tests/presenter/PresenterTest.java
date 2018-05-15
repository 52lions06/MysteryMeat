package presenter;

import model.Coke;
import model.Taco;
import org.junit.Before;
import org.junit.Test;
import presenter.Presenter;
import view.ContentPanel;
import view.MysteryMeatFrame;

import javax.swing.*;

import static org.junit.Assert.*;

public class PresenterTest {

    public Presenter presenter;

    @Before
    public void setup(){
        presenter = new Presenter( new MysteryMeatFrame() );
    }

    @Test
    public void testPresenterHasMMFrame(){
        MysteryMeatFrame mysteryMeatFrame = new MysteryMeatFrame();
        Presenter presenter_0 = new Presenter( mysteryMeatFrame );
        assertEquals( mysteryMeatFrame, presenter_0.getFrame() );
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
    public void testPresenterHasMenuItemsPanel(){
        assertEquals("MenuItemPanel", ((ContentPanel) presenter.getContentPanel()).getMenuItemPanel().getName());
    }

    @Test
    public void testCokeButtonAddsCokeToTheOrder(){
        ((ContentPanel) presenter.getContentPanel()).getCustomerNamePanel().getCustomer_name_button().doClick();
        ((ContentPanel) presenter.getContentPanel()).getMenuItemPanel().getAddCokeButton().doClick();
        assertEquals(1, presenter.getOrder().getOrderSize());

        assertTrue(presenter.getOrder().getItem(0) instanceof Coke);

    }

    @Test
    public void testTacoButtonAddsTacoToTheOrder() {
        ((ContentPanel) presenter.getContentPanel()).getCustomerNamePanel().getCustomer_name_button().doClick();
        ((ContentPanel) presenter.getContentPanel()).getMenuItemPanel().getAddTacoButton().doClick();
        assertEquals(1, presenter.getOrder().getOrderSize());

        assertTrue(presenter.getOrder().getItem(0) instanceof Taco);

    }

    @Test
    public void testPresenterHasOrderDisplayPanel(){
        assertEquals("OrderDisplayPanel", ((ContentPanel) presenter.getContentPanel()).getOrderDisplayPanel().getName());
    }

    @Test
    public void test_PresenterCreatesOrderOnNameButtonClickIfOrderIsNull() {
        JTextField customerNameField = ( (ContentPanel) presenter.getContentPanel() )
                .getCustomerNamePanel()
                .getCustomer_name_TextField();

        JButton customerNameButton = ( (ContentPanel) presenter.getContentPanel() )
                .getCustomerNamePanel()
                .getCustomer_name_button();

        customerNameField.setText("Bob");
        customerNameButton.doClick();

        assertNotNull(presenter.getOrder());
        assertEquals("Bob", presenter.getOrder().getCustomerName());
    }

    @Test
    public void test_PresenterCreatesOrderOnMenuButtonClickIfOrderIsNull() {
        JButton menuItemButton = ( (ContentPanel) presenter.getContentPanel() )
                .getMenuItemPanel()
                .getAddCokeButton();

        menuItemButton.doClick();
        menuItemButton.doClick();
        menuItemButton.doClick();
        menuItemButton.doClick();

        assertNotNull( presenter.getOrder() );
        assertEquals( 4, presenter.getOrder().getOrderSize() );
    }

    @Test
    public void test_PresenterCanCreateNewOrderWithExistingOrderPresent() {
        JTextField customerNameField = ( (ContentPanel) presenter.getContentPanel() )
                .getCustomerNamePanel()
                .getCustomer_name_TextField();

        JButton customerNameButton = ( (ContentPanel) presenter.getContentPanel() )
                .getCustomerNamePanel()
                .getCustomer_name_button();

        JButton menuItemButton = ( (ContentPanel) presenter.getContentPanel() )
                .getMenuItemPanel()
                .getAddCokeButton();

        customerNameField.setText("Bob");
        customerNameButton.doClick();

        menuItemButton.doClick();
        menuItemButton.doClick();

        customerNameField.setText("Doug");
        customerNameButton.doClick();


        assertEquals(2, presenter.getOrder().getOrderSize());
        assertEquals("Doug", presenter.getOrder().getCustomerName());

    }

}