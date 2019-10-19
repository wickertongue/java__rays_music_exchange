import items.Book;
import items.SetOfPicks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetOfPicksTest {

    SetOfPicks setOfPicks;

    @Before
    public void before() {
        setOfPicks = new SetOfPicks("A-Z of Basic Chords", "Gary Shredder", "Guitar", 4.49, 6.00);
    }

    @Test
    public void canGetTitle() {
        assertEquals("A-Z of Basic Chords", setOfPicks.getTitle());
    }

    @Test
    public void canGetAuthor() {
        assertEquals("Gary Shredder", setOfPicks.getAuthor());
    }

    @Test
    public void canGetInstrumentCovered() {
        assertEquals("Guitar", setOfPicks.getInstrumentCovered());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(4.49, setOfPicks.getPurchasePrice(),1);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(6.00, setOfPicks.getSalePrice(),1);
    }

}
