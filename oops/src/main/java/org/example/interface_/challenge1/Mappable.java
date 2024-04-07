package org.example.interface_.challenge1;

public interface Mappable {
    String JSON_PROPERTY = "\"properties\": {%s}";

    String getLabel();

    String getMarker();

    Geometry getShape();

    static void mapId(Mappable m) {
        System.out.println(JSON_PROPERTY.formatted(m.toJson()));
    }

    default String toJson() {
        return """
                "type": "%s", "label": "%s", "marker": "%s" """.formatted(getShape(), getLabel(), getMarker());
    }
}
