package instruments;

import accessories.Reeds;
import org.junit.Before;
import org.junit.Test;
import types.SaxophoneType;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {
    private Reeds reeds;
    private Saxophone saxophone;

    @Before
    public void before() {
        reeds = new Reeds("Vandoran Traditional Alto", 15, 20, 3, 10);
        saxophone = new Saxophone("Startone", "SAS-75", 175, 225, SaxophoneType.ALTO, reeds);
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Startone", saxophone.getManufacturer());
    }

    @Test
    public void hasModel() {
        assertEquals("SAS-75", saxophone.getModel());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(175, saxophone.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(225, saxophone.getSellPrice());
    }

    @Test
    public void hasSaxophoneType() {
        assertEquals(SaxophoneType.ALTO, saxophone.getSaxophoneType());
    }

    @Test
    public void hasReeds() {
        assertEquals(reeds, saxophone.getReeds());
    }

    @Test
    public void canGetDescription() {
        assertEquals("Startone SAS-75", saxophone.getDescription());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(50, saxophone.calculateMarkup());
    }

    @Test
    public void canPlay() {
        assertEquals("*Wootee woo woahhh*", saxophone.play());
    }
}
