package instruments;

import accessories.Reeds;
import types.Family;
import types.SaxophoneType;

public class Saxophone extends Instrument {
    private SaxophoneType saxophoneType;
    private Reeds reeds;

    public Saxophone(String manufacturer, String model, int buyPrice, int sellPrice, SaxophoneType saxophoneType, Reeds reeds) {
        super(manufacturer, model, Family.WOODWIND, buyPrice, sellPrice);
        this.saxophoneType = saxophoneType;
        this.reeds = reeds;
    }

    public SaxophoneType getSaxophoneType() {
        return saxophoneType;
    }

    public Reeds getReeds() {
        return reeds;
    }

    @Override
    public String play() {
        return "*Wootee woo woahhh*";
    }
}
