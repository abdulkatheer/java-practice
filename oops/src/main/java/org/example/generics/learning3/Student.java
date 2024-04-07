package org.example.generics.learning3;

import java.util.Random;

public class Student implements QueryItem {
    private String name;
    private String course;
    private int yearStarted;

    protected static Random random = new Random();

    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static String[] courses = {"C++", "Java", "Python"};

    public Student() {
        int lastNameIndex = random.nextInt(65, 91);
        this.name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        this.course = courses[random.nextInt(3)];
        this.yearStarted = random.nextInt(2000, 2023);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public String toString() {
        return "%-15s %-15s %d".formatted(name, course, yearStarted);
    }

    @Override
    public boolean matchField(String fieldName, String fieldValue) {
        fieldName = fieldName.toUpperCase();
        return switch (fieldName) {
            case "NAME" -> name.equalsIgnoreCase(fieldValue);
            case "COURSE" -> course.equalsIgnoreCase(fieldValue);
            default -> false;
        };
    }
}