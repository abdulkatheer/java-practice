package org.example.linked_list.challenge1;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Place> places = new LinkedList<>();
        addPlace(places, new Place("Adelaide", 1374));
        addPlace(places, new Place("Adelaide", 2222));
        addPlace(places, new Place("Brisbane", 917));
        addPlace(places, new Place("Perth", 3923));
        addPlace(places, new Place("Alice Springs", 2771));
        addPlace(places, new Place("Alice springs", 1122));
        addPlace(places, new Place("Darwin", 3972));
        addPlace(places, new Place("Melbourne", 877));
        addPlace(places, new Place("Sydney", 0));
        System.out.println(places);

        Scanner scanner = new Scanner(System.in);
        boolean forward = true;
        printMenu();
        ListIterator<Place> iterator = places.listIterator();

        while (true) {
            if (!iterator.hasPrevious()) { // everytime have a check if reached beginning
                System.out.println("Reached origin : " + iterator.next());
                forward = true; // While reversing, if we reach deadend, changing direction to forward
            }
            if (!iterator.hasNext()) { // everytime have a check if reached end
                System.out.println("Reached destination : " + iterator.previous());
                forward = false;
            }
            String option = scanner.nextLine();
            switch (option) {
                case "F" -> {
                    if (!forward) { // When switching direction, eating 1 cursor
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                    }
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                }
                case "B" -> {
                    if (forward) { // When switching direction, eating 1 cursor
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                }
                case "L" -> System.out.println(places);
                case "M" -> printMenu();
                default -> {
                    return;
                }
            }
        }
    }

    private static void addPlace(LinkedList<Place> places, Place place) {
        if (places.contains(place)) {
            System.out.println("Found duplicate :: " + place);
            return;
        }

        for (Place p : places) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate :: " + place);
                return;
            }
        }

        int i = 0;
        for (Place p : places) {
            if (p.distance() > place.distance()) {
                places.add(i, place);
                return;
            }
            i++;
        }
        places.add(place);
    }

    private static void printMenu() {
        String menu = """
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist places
                (M)enu
                (Q)uit""";
        System.out.println(menu);
    }
}
