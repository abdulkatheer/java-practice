package org.example.enumeration.learning;

/*
1. It's a collection of ordered list of elements
2. To store set of known fixed constants
3. Special data type
4. Set of named constants
5. Like record, enum also ends up in a class that extends java.lang.enum at compile-time
6. It already extends something, so we can't extend
 */
enum DayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

public class Part1 {
    public static void main(String[] args) {
        System.out.println(DayOfWeek.FRIDAY);
        System.out.println(DayOfWeek.FRIDAY.ordinal());

        System.out.println(DayOfWeek.FRIDAY == DayOfWeek.valueOf("FRIDAY"));

        System.out.println(DayOfWeek.values().length);

        DayOfWeek[] daysOfWeek = DayOfWeek.values();
        for (DayOfWeek dayOfWeek : daysOfWeek) {
            System.out.printf("Constant Identifier = %s; Ordinal = %s%n", dayOfWeek.name(), dayOfWeek.ordinal());
        }
    }
}
