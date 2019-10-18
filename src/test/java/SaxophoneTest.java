import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone sax;

    @Before
    public void before() {
        sax = new Saxophone("Brass", "Gold", "Brass");
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
        assertEquals("Brass", sax.getType());
    }

}
