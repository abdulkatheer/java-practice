package org.example.enum_collection;

import java.util.EnumSet;
import java.util.Objects;

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

enum Type {
    WORK_DAY,
    OFF_DAY
}

public class EnumSetPractice {
    public static void main(String[] args) {
        EnumSet<Day> s1 = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
        System.out.println(s1.getClass().getName());
        s1.add(Day.FRIDAY);

//        EnumSet s2 = EnumSet.of((Enum) Day.SATURDAY, (Enum) Type.OFF_DAY);
    }
}
