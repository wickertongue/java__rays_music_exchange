import instruments.Guitar;
import instruments.TypeType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Wood", "Olive Green", TypeType.STRING, 6, 125.00, 155.00);
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
        assertEquals(TypeType.STRING, guitar.getType());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canGetSound() {
        assertEquals("Twaaaaang", guitar.plays());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(125.00, guitar.getPurchasePrice(),1);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(155.00, guitar.getSalePrice(),1);
    }

}
