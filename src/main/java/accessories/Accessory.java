package accessories;

import behaviours.ISell;

public abstract class Accessory implements ISell {
    private String description;
    private int buyPrice;
    private int sellPrice;

    public Accessory(String description, int buyPrice, int sellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int calculateMarkup() {
        return getSellPrice() - getBuyPrice();
    }
}
