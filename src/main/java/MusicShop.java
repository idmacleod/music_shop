import behaviours.ISell;

import java.util.ArrayList;

public class MusicShop {
    private String name;
    private ArrayList<ISell> stock;

    public MusicShop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public int stockCount() {
        return stock.size();
    }

    public void addToStock(ISell item) {
        stock.add(item);
    }

    public ISell removeFromStock(ISell item) {
        if (stock.contains(item)) {
            stock.remove(item);
            return item;
        }
        return null;
    }
}
