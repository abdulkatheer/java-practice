package org.example.generics.challenge1;

import java.util.Random;

public class Student implements QueryItem, Comparable<Student> {
    private int id;
    private String name;
    private String course;
    private int yearStarted;

    protected static Random random = new Random();

    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static String[] courses = {"C++", "Java", "Python"};

    public Student() {
        this.id = random.nextInt(1000, 10000);
        int lastNameIndex = random.nextInt(65, 91);
        this.name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        this.course = courses[random.nextInt(3)];
        this.yearStarted = random.nextInt(2000, 2023);
    }

    public String getName() {
        return name;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public String toString() {
        return "%-8s %-15s %-15s %d".formatted(id, name, course, yearStarted);
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

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(this.id).compareTo(o.id);
    }
}