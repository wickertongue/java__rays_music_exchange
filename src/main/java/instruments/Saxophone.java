package instruments;

public class Saxophone extends Instrument {
    private int numberOfKeys;

    public Saxophone(String material, String colour, String type, int numberOfKeys) {
        super(material, colour, type);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }

}
