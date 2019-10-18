package items;

public class SetOfPicks extends Item{
    private String brand;
    private int thickness;
    private int number;

    public SetOfPicks(String brand, int thickness, int number, double purchasePrice, double salePrice) {
        super(purchasePrice, salePrice);
        this.brand = brand;
        this.thickness = thickness;
        this.number = number;
    }

}
