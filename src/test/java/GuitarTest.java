import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Wood", "Olive Green", "String");
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Olive Green", guitar.getColour());
    }

    @Test
    public void canGetType() {
        assertEquals("String", guitar.getType());
    }


}