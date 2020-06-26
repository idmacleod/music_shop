package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import types.Family;

public abstract class Instrument implements IPlay, ISell {
    private String manufacturer;
    private String model;
    private Family family;
    private int buyPrice;
    private int sellPrice;

    public Instrument(String manufacturer, String model, Family family, int buyPrice, int sellPrice) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.family = family;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Family getFamily() {
        return family;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public String getDescription() {
        return getManufacturer() + " " + getModel();
    }

    public int calculateMarkup() {
        return getSellPrice() - getBuyPrice();
    }

    public abstract String play();
}
