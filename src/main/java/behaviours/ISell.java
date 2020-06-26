package behaviours;

public interface ISell {
    String getDescription();
    int getBuyPrice();
    int getSellPrice();
    int calculateMarkup();
}
