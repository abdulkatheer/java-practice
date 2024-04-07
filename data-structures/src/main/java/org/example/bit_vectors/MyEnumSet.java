package org.example.bit_vectors;

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

public class MyEnumSet<E extends Enum<E>> {
    private long vector = 0;

    public void add(E e) {
        System.out.println("Vector Binary (before) => " + Long.toBinaryString(vector));
        int positionOfElement = e.ordinal();
        System.out.println("Position of element => " + (positionOfElement + 1));
        int a = 1 << positionOfElement;
        System.out.println("Enum Binary => " + Integer.toBinaryString(a));
        vector |= a;
        System.out.println("Vector Binary (after) => " + Long.toBinaryString(vector));
        System.out.println("-".repeat(35));
    }

    public void remove(E e) {
        System.out.println("Vector Binary (before) => " + Long.toBinaryString(vector));
        int positionOfElement = e.ordinal();
        System.out.println("Position of element => " + (positionOfElement + 1));
        int a = 1 << positionOfElement;
        System.out.println("Enum Binary => " + Integer.toBinaryString(a));
        vector &= ~a;
        System.out.println("Vector Binary (after) => " + Long.toBinaryString(vector));
        System.out.println("-".repeat(35));
    }

    public static void main(String[] args) {
        MyEnumSet<Day> s = new MyEnumSet<>();
        s.add(Day.FRIDAY);
        s.add(Day.SUNDAY);
        s.add(Day.MONDAY);
        s.add(Day.SATURDAY);

        s.remove(Day.SUNDAY);
        s.remove(Day.FRIDAY);
        s.remove(Day.MONDAY);
        s.remove(Day.SATURDAY);
    }
}
