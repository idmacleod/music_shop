import accessories.Bow;
import accessories.SheetMusic;
import instruments.Violin;
import org.junit.Before;
import org.junit.Test;
import types.ViolinType;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {
    private Bow bow;
    private Violin violin;
    private SheetMusic sheetMusic;
    private MusicShop musicShop;

    @Before
    public void before() {
        bow = new Bow("Dorfler Master No. 19", 280, 300, "Pernambuco", "Nickel Silver");
        violin = new Violin("Scala Vilagio", "PSH04", 3000, 3500, ViolinType.CLASSICAL, bow);
        sheetMusic = new SheetMusic("Piano Masterworks", 5, 15, "Classical", "Intermediate");
        musicShop = new MusicShop("Macleod's Harmonious Emporium");
    }

    @Test
    public void hasName() {
        assertEquals("Macleod's Harmonious Emporium", musicShop.getName());
    }

    @Test
    public void shopStartsEmpty() {
        assertEquals(0, musicShop.stockCount());
    }

    @Test
    public void canAddToStock() {
        musicShop.addToStock(bow);
        musicShop.addToStock(violin);
        musicShop.addToStock(sheetMusic);
        assertEquals(3, musicShop.stockCount());
    }

    @Test
    public void canRemoveFromStock() {
        musicShop.addToStock(sheetMusic);
        musicShop.addToStock(violin);
        musicShop.removeFromStock(sheetMusic);
        assertEquals(1, musicShop.stockCount());
    }
}
