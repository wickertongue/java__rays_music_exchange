package instruments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {
    private String material;
    private String colour;
    private TypeType type;

    public Instrument(String material, String colour, TypeType type) {
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public TypeType getType() {
        return type;
    }
}
