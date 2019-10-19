import items.Book;
import items.SetOfPicks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetOfPicksTest {

    SetOfPicks setOfPicks;

    @Before
    public void before() {
        setOfPicks = new SetOfPicks("Fender", 0.81, 6, 2.00, 3.00);
    }

    @Test
    public void canGetBrand() {
        assertEquals("Fender", setOfPicks.getBrand());
    }

    @Test
    public void canGetThickness() {
        assertEquals(0.81, setOfPicks.getThickness(),1);
    }

    @Test
    public void canGetNumberOfPicksInSet() {
        assertEquals(6, setOfPicks.getNumber());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(2.00, setOfPicks.getPurchasePrice(),1);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(3.00, setOfPicks.getSalePrice(),1);
    }

}
