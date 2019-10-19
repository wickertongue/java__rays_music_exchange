import instruments.Piano;
import instruments.TypeType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Mahogany", "White", TypeType.KEYBOARD, 88);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Mahogany", piano.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("White", piano.getColour());
    }

    @Test
    public void canGetType() {
        assertEquals(TypeType.KEYBOARD, piano.getType());
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canGetSound() {
        assertEquals("Plink plonk", piano.plays());
    }


}
