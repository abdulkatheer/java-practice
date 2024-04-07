package org.example.comparision.learning;

import java.util.Comparator;

public class StudentGpaComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getGpa() + o1.getName()).compareTo(o2.getGpa() + o2.getName());
    }
}
