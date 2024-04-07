package org.example.comparision.learning;

public class Student implements Comparable<Student> {
    private static int LAST_ID = 1000;

    private int id;
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.id = LAST_ID++;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }

    @Override
    public String toString() {
        return "id: %d; name: %s; gpa: %.2f".formatted(id, name, gpa);
    }
}
