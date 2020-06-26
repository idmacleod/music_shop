package instruments;

import org.junit.Before;
import org.junit.Test;
import types.PianoType;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    private Piano piano;

    @Before
    public void before() {
        piano = new Piano("Yamaha", "CF3", 50000, 75000, PianoType.GRAND);
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Yamaha", piano.getManufacturer());
    }

    @Test
    public void hasModel() {
        assertEquals("CF3", piano.getModel());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(50000, piano.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(75000, piano.getSellPrice());
    }

    @Test
    public void hasPianoType() {
        assertEquals(PianoType.GRAND, piano.getPianoType());
    }

    @Test
    public void canGetDescription() {
        assertEquals("Yamaha CF3", piano.getDescription());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(25000, piano.calculateMarkup());
    }

    @Test
    public void canPlay() {
        assertEquals("*Tinkle tinkle, tinkly tinkle*", piano.play());
    }
}
