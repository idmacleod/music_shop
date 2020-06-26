package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowTest {
    private Bow bow;

    @Before
    public void before() {
        bow = new Bow("Dorfler Master No. 19", 280, 300, "Pernambuco", "Nickel Silver");
    }

    @Test
    public void hasDescription() {
        assertEquals("Dorfler Master No. 19", bow.getDescription());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(280, bow.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(300, bow.getSellPrice());
    }

    @Test
    public void hasWood() {
        assertEquals("Pernambuco", bow.getWood());
    }

    @Test
    public void hasMetal() {
        assertEquals("Nickel Silver", bow.getMetal());
    }
}
