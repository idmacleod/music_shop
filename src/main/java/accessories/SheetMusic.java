package accessories;

public class SheetMusic extends Accessory {
    private String genre;
    private String difficulty;

    public SheetMusic(String description, int buyPrice, int sellPrice, String genre, String difficulty) {
        super(description, buyPrice, sellPrice);
        this.genre = genre;
        this.difficulty = difficulty;
    }

    public String getGenre() {
        return genre;
    }

    public String getDifficulty() {
        return difficulty;
    }
}
