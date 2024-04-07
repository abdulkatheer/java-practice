package org.example.generics.challenge1;

import java.util.Comparator;

public class StudentYearComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.valueOf(o1.getYearStarted()).compareTo(Integer.valueOf(o2.getYearStarted()));
    }
}
