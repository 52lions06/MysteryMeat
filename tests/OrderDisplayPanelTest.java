import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrderDisplayPanelTest {

    private OrderDisplayPanel orderDisplayPanel;
    private Presenter presenter;

    @Before
    public void setUp(){
         orderDisplayPanel = new OrderDisplayPanel();
         presenter = new Presenter(new MysteryMeatFrame());

    }

    @Test
    public void testOrderDisplayPanelHasArrayListOfItems(){
         orderDisplayPanel = new OrderDisplayPanel();
        assertEquals(0, orderDisplayPanel.getListOfItems().size());
    }

    @Test
    public void testOrderDisplayPanelArrayListOfItems_Has_One_Item(){
        orderDisplayPanel = new OrderDisplayPanel();
        ((ContentPanel) presenter.getContentPanel()).getMenuItemPanel().getAddCokeButton().doClick();
        orderDisplayPanel.updateOrderDisplay(presenter.getOrder());
        assertEquals(1, orderDisplayPanel.getListOfItems().size());
        
    }

}