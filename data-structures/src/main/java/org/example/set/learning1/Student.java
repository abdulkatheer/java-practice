package org.example.set.learning1;

import java.util.Objects;
import java.util.UUID;

public class Student {
//    private UUID id;
    private String id;
    private int marks;

//    public Student(UUID id, int marks) {
//        this.id = id;
//        this.marks = marks;
//    }


    public Student(String id, int marks) {
        this.id = id;
        this.marks = marks;
    }

//    public UUID getId() {
//        return id;
//    }


    public String getId() {
        return id;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "%-20s %d".formatted(id, marks);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
