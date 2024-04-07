package org.example.interface_.challenge1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Sydney Town Hall", BuildingType.GOVERNMENT));
        mappables.add(new Building("Sydney Opera House", BuildingType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Australia", BuildingType.SPORTS));

        mappables.add(new Utility("College St", UtilityType.FIBRE_OPTIC));
        mappables.add(new Utility("Olymbic Blvd", UtilityType.WATER));

        for (var m : mappables) {
            Mappable.mapId(m);
        }
    }
}
