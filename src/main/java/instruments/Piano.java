package instruments;

public class Piano extends Instrument {
    private int numberOfKeys;

    public Piano(String material, String colour, TypeType type, int numberOfKeys) {
        super(material, colour, type);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }

    public String plays() {
        return "Plink plonk";
    }

}
