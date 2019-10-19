package instruments;

public class Saxophone extends Instrument {
    private int numberOfKeys;

    public Saxophone(String material, String colour, TypeType type, int numberOfKeys) {
        super(material, colour, type);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }

    public String plays() {
        return "Buhoomu-hoooooooom";
    }

}
