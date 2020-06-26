package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReedsTest {
    private Reeds reeds;

    @Before
    public void Before() {
        reeds = new Reeds("Vandoran Traditional Alto", 15, 20, 3, 10);
    }

    @Test
    public void hasDescription() {
        assertEquals("Vandoran Traditional Alto", reeds.getDescription());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(15, reeds.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(20, reeds.getSellPrice());
    }

    @Test
    public void hasStrength() {
        assertEquals(3, reeds.getStrength());
    }

    @Test
    public void hasNumberInPack() {
        assertEquals(3, reeds.getNumberInPack());
    }
}
