package org.example.generics.learning3;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
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

        QueryList<LPAStudent> queryList = new QueryList<>(lpaStudents);
        List<LPAStudent> matches = queryList.getMatches("Course", "Python");
        printList(matches);

        matches = QueryList.getMatches(lpaStudents, "Course", "Python");
        printList(matches);

        var matches1 = QueryList.<Student>getMatches(new ArrayList<>(), "Course", "Python");
        printList(matches1);

        List<Student> matches2 = QueryList.getMatches(new ArrayList<>(), "Course", "Python");
        printList(matches1);
    }

    public static void printList(List<? extends Student> students) {
        for (Student student : students) {
            System.out.println(student.getYearStarted() + ": " + student);
        }
        System.out.println();
    }
}
