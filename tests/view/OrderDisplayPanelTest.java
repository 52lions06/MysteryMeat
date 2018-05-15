package view;

import org.junit.Before;
import org.junit.Test;
import presenter.Presenter;

import javax.swing.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class OrderDisplayPanelTest {

    private OrderDisplayPanel orderPanel;


    @Before
    public void setup() {
        this.orderPanel = new OrderDisplayPanel();
    }

    @Test
    public void test_canSetCustomerName() {
        OrderDisplayPanel orderPanel_0 = new OrderDisplayPanel();
        OrderDisplayPanel orderPanel_1 = new OrderDisplayPanel();

        orderPanel_0.setCustomerName( "Some Customer" );
        orderPanel_1.setCustomerName( "Another Customer" );

        assertEquals(
                "Order for : Some Customer",
                ( (JLabel) orderPanel_0.getComponents()[ 0 ] ).getText()
        );

        assertEquals(
                "Order for : Another Customer",
                ( (JLabel) orderPanel_1.getComponents()[ 0] ).getText()
        );


    }

    @Test
    public void test_hasHeaderLabel() {
        assertEquals(
                "Item     Qty.     Unit.     Price.     ",
                ( (JLabel) this.orderPanel.getComponents()[ 1 ] ).getText()
        );
    }

    @Test
    public void test_canAddItemToDisplay() {
        this.orderPanel.addItem( "Coke" + "     1" + "     1.75" + "     1.75" );
        this.orderPanel.addItem( "Taco" + "     1" + "     3.00" + "     3.00" );

        assertEquals(
                "Coke" + "     1" + "     1.75" + "     1.75",
                ( (JLabel) this.orderPanel.getComponents()[ 2 ] ).getText()
        );
        assertEquals(
                "Taco" + "     1" + "     3.00" + "     3.00",
                ( (JLabel) this.orderPanel.getComponents()[ 3 ] ).getText()
        );
    }

    @Test
    public void test_canAddMultipleItemsToDisplay() {
        ArrayList<String> itemLines = new ArrayList<>();

        itemLines.add( "Coke" + "     1" + "     1.75" + "     1.75" );
        itemLines.add( "Taco" + "     1" + "     3.00" + "     3.00" );

        this.orderPanel.setItems( itemLines );

        assertEquals(
                "Coke" + "     1" + "     1.75" + "     1.75",
                ( (JLabel) this.orderPanel.getComponents()[ 2 ] ).getText()
        );
        assertEquals(
                "Taco" + "     1" + "     3.00" + "     3.00",
                ( (JLabel) this.orderPanel.getComponents()[ 3 ] ).getText()
        );
    }


//    private OrderDisplayPanel orderDisplayPanel;
//    private Presenter presenter;
//
//    @Before
//    public void setUp(){
//         orderDisplayPanel = new OrderDisplayPanel();
//         presenter = new Presenter(new MysteryMeatFrame());
//    }
//
//    @Test
//    public void testOrderDisplayPanelHasArrayListOfItems(){
//         orderDisplayPanel = new OrderDisplayPanel();
//        assertEquals(0, orderDisplayPanel.getListOfItems().size());
//    }
//
//    @Test
//    public void testOrderDisplayPanelArrayListOfItems_Has_One_Item(){
////        orderDisplayPanel = new OrderDisplayPanel();
////        ((ContentPanel) presenter.getContentPanel()).getMenuItemPanel().getAddCokeButton().doClick();
////        orderDisplayPanel.updateOrderDisplay(presenter.getOrder());
////        assertEquals(1, orderDisplayPanel.getListOfItems().size());
////
//    }
//
//    @Test
//    public void testOderDisplayhasStaticHeaderLabel() {
//        assertEquals("ITEM (Options)     Qty.     Unit.     Price.",((JLabel)((ContentPanel) presenter.getContentPanel()).getOrderDisplayPanel().getComponents()[1]).getText());
//    }
//
//    @Test
//    public void testCokeOnOrderDisplayShowsQuantityAndPrice() {
//        ((ContentPanel) presenter.getContentPanel()).getMenuItemPanel().getAddCokeButton().doClick();
//        assertEquals("Coke   1   1.75", ((JLabel)((ContentPanel) presenter.getContentPanel()).getOrderDisplayPanel().getComponents()[2]).getText());
//    }

}