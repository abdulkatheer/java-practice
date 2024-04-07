package org.example.interface_.challenge1;

public class Building implements Mappable {
    private String name;
    private BuildingType type;

    public Building(String name, BuildingType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return name + " (" + type + ")";
    }

    @Override
    public String getMarker() {
        return switch (type) {
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarker.TRIANGLE;
            case GOVERNMENT -> Color.RED + " " + PointMarker.STAR;
            case SPORTS -> Color.ORANGE + " " + PointMarker.PUSH_PIN;
            case RESIDENTIAL -> Color.BLUE + " " + PointMarker.SQUARE;
        };
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String toJson() {
        return Mappable.super.toJson() + """
                , "name": "%s", "usage": "%s """.formatted(name, type);
    }
}
