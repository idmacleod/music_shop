package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    private SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("Piano Masterworks", 5, 15, "Classical", "Intermediate");
    }

    @Test
    public void hasDescription() {
        assertEquals("Piano Masterworks", sheetMusic.getDescription());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(5, sheetMusic.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(15, sheetMusic.getSellPrice());
    }

    @Test
    public void hasGenre() {
        assertEquals("Classical", sheetMusic.getGenre());
    }

    @Test
    public void hasDifficulty() {
        assertEquals("Intermediate", sheetMusic.getDifficulty());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(10, sheetMusic.calculateMarkup());
    }
}
