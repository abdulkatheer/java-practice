package org.example.enumeration.learning;

enum Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST
}

public class Part2 {
    public static void main(String[] args) {
        for (Direction d : Direction.values()) {
            String message = switch (d) {
                case NORTH -> "Heading towards North";
                case SOUTH -> "Heading towards South";
                default -> "Heading towards " + d.name().charAt(0) + d.name().substring(1).toLowerCase();
            };
            System.out.println(message);
        }
    }
}
