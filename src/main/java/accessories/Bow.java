package accessories;

public class Bow extends Accessory {
    private String wood;
    private String metal;

    public Bow(String description, int buyPrice, int sellPrice, String wood, String metal) {
        super(description, buyPrice, sellPrice);
        this.wood = wood;
        this.metal = metal;
    }

    public String getWood() {
        return wood;
    }

    public String getMetal() {
        return metal;
    }
}
