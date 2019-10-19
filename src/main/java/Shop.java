import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;
    private String name;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    public void addToStock(ISell item) {
        stock.add(item);
    }

    public void removeFromStock(ISell item) {
        stock.remove(item);
    }

    public ISell getItemFromStock(ISell item) {
        ISell foundItem = null;
        for (ISell eachItem : stock) {
            if (eachItem == item) {
                foundItem = item;
            }
        }
        return foundItem;
    }
}
