package items;

public class SetOfPicks extends Item{
    private String brand;
    private double thickness;
    private int number;

    public SetOfPicks(String brand, double thickness, int number, double purchasePrice, double salePrice) {
        super(purchasePrice, salePrice);
        this.brand = brand;
        this.thickness = thickness;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public double getThickness() {
        return thickness;
    }

    public int getNumber() {
        return number;
    }
}
