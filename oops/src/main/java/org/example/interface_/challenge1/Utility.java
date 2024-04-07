package org.example.interface_.challenge1;

public class Utility implements Mappable {
    private String name;
    private UtilityType type;

    public Utility(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return name + " (" + type + ")";
    }

    @Override
    public String getMarker() {
        return switch(type) {
            case ELECTRICAL -> Color.RED + " " + LineMarker.DASHED;
            case FIBRE_OPTIC -> Color.GREEN + " " + LineMarker.DOTTED;
            case GAS -> Color.ORANGE + " " + LineMarker.SOLID;
            case WATER -> Color.BLUE + " " + LineMarker.SOLID;
        };
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String toJson() {
        return Mappable.super.toJson() + """
                , name": "%s", "utility: "%s" """.formatted(name, type);
    }
}
