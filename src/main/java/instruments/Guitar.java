package instruments;

import behaviours.ISell;

public class Guitar extends Instrument implements ISell {
    private int numberOfStrings;
    private double purchasePrice;
    private double salePrice;

    public Guitar(String material, String colour, TypeType type, int numberOfStrings, double purchasePrice,
                  double salePrice) {
        super(material, colour, type);
        this.numberOfStrings = numberOfStrings;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public String plays() {
        return "Twaaaaang";
    }

    public double calculateMarkup() {
        return this.salePrice - this.purchasePrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }
}
