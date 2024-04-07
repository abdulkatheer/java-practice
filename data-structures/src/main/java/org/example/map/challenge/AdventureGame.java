package org.example.map.challenge;

import java.util.HashMap;
import java.util.Map;

public class AdventureGame {
    private static final String MAP_DATA = """
            road,at the end of the road, W: hill, E:well house,S:valley,N:forest
            hill,on top of hill with a view in all directions,N:forest, E:road
            well house,inside a well house for a small spring,W:road,N:lake,S:stream
            valley,in a forest valley beside a tumbling stream,N:road,W:hill,E:stream
            forest,at the edge of a thick dark forest,S:road,E:lake
            lake,by an alpine lake surrounded by wildflowers,W:forest,S:well house
            stream,near a stream with a rocky bed,W:valley, N:well house""";

    private enum Direction {
        N, S, E, W;

        private static final String[] directions = {"North", "South", "East", "West"};

        public String getValue() {
            return directions[this.ordinal()];
        }
    }

    private record Location(String description, Map<Direction, String> nextPlaces) {
    }

    private String lastPlace;
    private Map<String, Location> adventureMap = new HashMap<>();

    public AdventureGame() {
        this(null);
    }

    public AdventureGame(String data) {
        loadAdventureMap(MAP_DATA);
        if (data != null) {
            loadAdventureMap(data);
        }
    }

    private void loadAdventureMap(String data) {
        String[] locations = data.split("\\R");
        for (String location : locations) {
            String[] locationSplits = location.trim().split(",", 3);
            this.adventureMap.put(locationSplits[0], new Location(locationSplits[1], parseNextPlaces(locationSplits[2])));
        }
        adventureMap.entrySet().forEach(System.out::println);
    }

    private Map<Direction, String> parseNextPlaces(String data) {
        String[] nextPlacesSplit = data.split(",");
        Map<Direction, String> places = new HashMap<>();
        for (String nextPlace : nextPlacesSplit) {
            String[] split = nextPlace.trim().split(":");
            places.put(Direction.valueOf(split[0].trim()), split[1].trim());
        }
        return places;
    }

    private void visit(Location location) {
        System.out.printf("*** You're standing %s *** %n", location.description);
        System.out.println("\t From here, you can see:");

        location.nextPlaces.forEach((direction, s) -> {
            System.out.printf("\t* A %s to the %s (%S) %n", s, direction.getValue(), direction);
        });

        System.out.print("Select your direction (Q to Quit) >>");
    }

    public void move(String direction) {
        Map<Direction, String> nextPlaces = adventureMap.get(lastPlace).nextPlaces;
        String nextPlace = nextPlaces.get(Direction.valueOf(direction));
        play(nextPlace);
    }

    public void play(String location) {
        if (adventureMap.containsKey(location)) {
            Location next = adventureMap.get(location);
            this.lastPlace = location;
            visit(next);
        } else {
            System.out.println("Invalid location");
        }
    }

}
