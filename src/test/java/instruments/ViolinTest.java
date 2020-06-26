package instruments;

import accessories.Bow;
import org.junit.Before;
import org.junit.Test;
import types.ViolinType;

import static org.junit.Assert.assertEquals;

public class ViolinTest {
    private Bow bow;
    private Violin violin;

    @Before
    public void before() {
        bow = new Bow("Dorfler Master No. 19", 280, 300, "Pernambuco", "Nickel Silver");
        violin = new Violin("Scala Vilagio", "PSH04", 3000, 3500, ViolinType.CLASSICAL, bow);
    }

    @Test
    public void hasManufacturer() {
        assertEquals("Scala Vilagio", violin.getManufacturer());
    }

    @Test
    public void hasModel() {
        assertEquals("PSH04", violin.getModel());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(3000, violin.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(3500, violin.getSellPrice());
    }

    @Test
    public void hasViolinType() {
        assertEquals(ViolinType.CLASSICAL, violin.getViolinType());
    }

    @Test
    public void hasBow() {
        assertEquals(bow, violin.getBow());
    }

    @Test
    public void canGetDescription() {
        assertEquals("Scala Vilagio PSH04", violin.getDescription());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(500, violin.calculateMarkup());
    }

    @Test
    public void canPlay() {
        assertEquals("*Screeeee scree chum chum*", violin.play());
    }
}
