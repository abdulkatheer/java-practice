package org.example.generics.learning2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
//        List<Student> students1 = new ArrayList<LPAStudent>();
        for (int i = 0; i < 10; i++) {
            students.add(new Student());
        }
        students.add(new LPAStudent());
        printList(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lpaStudents.add(new LPAStudent());
        }
        printList(lpaStudents);
    }
//    public static void printList(List<Student> students) {
//        for (Student student : students) {
//            System.out.println(student);
//        }
//        System.out.println();
//    }

//    public static void printList(List students) {
//        for (Object student : students) {
//            System.out.println(student);
//        }
//        System.out.println();
//    }

//    public static <T> void printList(List<T> students) {
//        for (Object student : students) {
//            System.out.println(student);
//        }
//        System.out.println();
//    }

//    public static <T extends Student> void printList(List<T> students) {
//        for (Student student : students) {
//            System.out.println(student.getYearStarted() + ": " + student);
//        }
//        System.out.println();
//    }

    // Unbounded
//    public static void printList(List<?> students) {
//        for (Object student : students) {
//            System.out.println(student);
//        }
//        System.out.println();
//    }

    // Upper bound; Student or any subtype of Student
    public static void printList(List<? extends Student> students) {
//        students.set(0, students.get(students.size() - 1));
        for (Student student : students) {
            System.out.println(student.getYearStarted() + ": " + student);
        }
        System.out.println();
    }

    // Lower bound; Student or any super-type of Student, Object in this case
//    public static void printList(List<? super Student> students) {
//        for (Object student : students) {
//            System.out.println(student);
//        }
//        System.out.println();
//    }
}
