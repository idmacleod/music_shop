package instruments;

import types.Family;
import types.PianoType;

public class Piano extends Instrument {
    private PianoType pianoType;

    public Piano(String manufacturer, String model, int buyPrice, int sellPrice, PianoType pianoType) {
        super(manufacturer, model, Family.KEYBOARD, buyPrice, sellPrice);
        this.pianoType = pianoType;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    public String play() {
        return "*Tinkle tinkle, tinkly tinkle*";
    }
}
