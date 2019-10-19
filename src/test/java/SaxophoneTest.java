import instruments.Saxophone;
import instruments.TypeType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone sax;

    @Before
    public void before() {
        sax = new Saxophone("Brass", "Gold", TypeType.WOODWIND, 9);
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
        assertEquals(TypeType.WOODWIND, sax.getType());
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(9, sax.getNumberOfKeys());
    }

    @Test
    public void canGetSound() {
        assertEquals("Buhoomu-hoooooooom", sax.plays());
    }

}
