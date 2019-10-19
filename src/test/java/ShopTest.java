import instruments.Guitar;
import items.Book;
import items.SetOfPicks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar;
    SetOfPicks setOfPicks;
    Book book;


    @Before
    public void before() {
        shop = new Shop("Rays Music Exchange");
        book = new Book("A-Z of Basic Chords", "Gary Shredder", "Guitar", 4.49, 6.00);
        guitar = new Guitar("Wood", "Olive Green", "String", 6, 125.00, 155.00);
        setOfPicks = new SetOfPicks("Fender", 0.81, 6, 2.00, 3.00);
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(guitar);
        shop.addToStock(book);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void canRemoveFromStock() {
        shop.addToStock(guitar);
        shop.addToStock(book);
        shop.removeFromStock(book);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canGetShopName() {
        assertEquals("Rays Music Exchange", shop.getName());
    }

    @Test
    public void canGetItemFromStock() {
        shop.addToStock(book);
        shop.addToStock(guitar);
        assertEquals(guitar, shop.getItemFromStock(guitar));
    }

    @Test
    public void canGetTotalProfit() {
        shop.addToStock(guitar); //
        shop.addToStock(book);
        shop.addToStock(setOfPicks);
        assertEquals(32.51, shop.totalProfit());
    }

}
