package instruments;

import accessories.Bow;
import types.Family;
import types.ViolinType;

public class Violin extends Instrument {
    private ViolinType violinType;
    private Bow bow;

    public Violin(String manufacturer, String model, int buyPrice, int sellPrice, ViolinType violinType, Bow bow) {
        super(manufacturer, model, Family.STRINGS, buyPrice, sellPrice);
        this.violinType = violinType;
        this.bow = bow;
    }

    public ViolinType getViolinType() {
        return violinType;
    }

    public Bow getBow() {
        return bow;
    }

    public String play() {
        return "*Screeeee scree chum chum*";
    }
}
