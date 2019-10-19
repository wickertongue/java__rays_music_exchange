package items;

import behaviours.ISell;

public abstract class Item implements ISell {
    private double purchasePrice;
    private double salePrice;

    public Item(double purchasePrice, double salePrice) {
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public double getPurchasePrice() {
        return this.purchasePrice;
    }

    public double getSalePrice() {
        return this.salePrice;
    }

    public double calculateMarkup() {
        return this.getSalePrice() - this.getPurchasePrice();
    }

}
