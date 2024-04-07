package org.example.learning1;

public enum Face {
    TWO("2", 0),
    THREE("3", 1),
    FOUR("4", 2),
    FIVE("5", 3),
    SIX("6", 4),
    SEVEN("7", 5),
    EIGHT("8", 6),
    NINE("9", 7),
    TEN("10", 8),
    JACK("J", 9),
    QUEEN("Q", 10),
    KING("K", 11),
    ACE("A", 12);

    private String value;
    private int rank;

    Face(String value, int rank) {
        this.value = value;
        this.rank = rank;
    }

    public String getValue() {
        return value;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "face=%s rank=%d".formatted(value, rank);
    }

    public static Face get(String value) {
        for (Face f : Face.values()) {
            if (f.value.equals(value)) {
                return f;
            }
        }
        return null;
    }
}
