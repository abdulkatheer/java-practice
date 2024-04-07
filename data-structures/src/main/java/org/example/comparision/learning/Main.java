package org.example.comparision.learning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Abdul", 3.97);
        Student s2 = new Student("Dhanalakshmi", 3.99);
        Student s3 = new Student("Hari", 3.45);

        Student[] students = {s1, s2, s3};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new StudentGpaComparator());
        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new StudentGpaComparator().reversed());
        System.out.println(Arrays.toString(students));
    }
}
