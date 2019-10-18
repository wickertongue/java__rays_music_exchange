import items.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void before() {
        book = new Book("A-Z of Basic Chords", "Gary Shredder", "Guitar", 4.49, 6.00);
    }

    @Test
    public void canGetTitle() {
        assertEquals("A-Z of Basic Chords", book.getTitle());
    }

    @Test
    public void canGetAuthor() {
        assertEquals("Gary Shredder", book.getAuthor());
    }

    @Test
    public void canGetInstrumentCovered() {
        assertEquals("Guitar", book.getInstrumentCovered());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(4.49, book.getPurchasePrice(),1);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(6.00, book.getSalePrice(),1);
    }

}
