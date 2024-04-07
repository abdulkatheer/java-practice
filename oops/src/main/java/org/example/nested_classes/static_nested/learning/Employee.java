package org.example.nested_classes.static_nested.learning;

import java.util.Comparator;

public class Employee {
    private int id;
    private String name;
    private int yearStarted;

    public Employee() {
    }

    public Employee(int id, String name, int yearStarted) {
        this.id = id;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public String toString() {
        return "%d %-8s %d".formatted(id, name, yearStarted);
    }

    public static class EmployeeIdComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.yearStarted - o2.yearStarted;
        }
    }

    public static class EmployeeComparator implements Comparator<Employee> {
        private final String sortType;

        public EmployeeComparator() {
            this("name");
        }

        public EmployeeComparator(String sortType) {
            this.sortType = sortType;
        }

        @Override
        public int compare(Employee o1, Employee o2) {
            return switch (sortType) {
                case "name" -> o1.name.compareTo(o2.name);
                case "id" -> Integer.valueOf(o1.id).compareTo(o2.id);
                case "yearStarted" -> Integer.valueOf(o1.yearStarted).compareTo(o2.yearStarted);
                default -> o1.name.compareTo(o2.name);
            };
        }
    }
}
