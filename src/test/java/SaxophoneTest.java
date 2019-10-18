import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone sax;

    @Before
    public void before() {
        sax = new Saxophone("Brass", "Gold", "Woodwind", 9);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Brass", sax.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Gold", sax.getColour());
    }

    @Test
    public void canGetType() {
        assertEquals("Woodwind", sax.getType());
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(9, sax.getNumberOfKeys());
    }

}
