package accessories;

public class Reeds extends Accessory {
    private int strength;
    private int numberInPack;

    public Reeds(String description, int buyPrice, int sellPrice, int strength, int numberInPack) {
        super(description, buyPrice, sellPrice);
        this.strength = strength;
        this.numberInPack = numberInPack;
    }

    public int getStrength() {
        return strength;
    }

    public int getNumberInPack() {
        return numberInPack;
    }
}
