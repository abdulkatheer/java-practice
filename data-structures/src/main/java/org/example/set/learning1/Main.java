package org.example.set.learning1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = getStudents(20);
        NavigableSet<Student> sortedById = new TreeSet<>(Comparator.comparing(Student::getId));
        sortedById.addAll(students);
        System.out.println("-".repeat(20));
        System.out.println("Sorted by ID");
        System.out.println("-".repeat(20));
        for (Student student : sortedById) {
            System.out.println(student);
        }

        System.out.println("-".repeat(20));
        System.out.println("Sorted by marks");
        System.out.println("-".repeat(20));
        NavigableSet<Student> sortedByMarks = new TreeSet<>(Comparator.comparing(Student::getMarks));
        sortedByMarks.addAll(students);
        for (Student student : sortedByMarks) {
            System.out.println(student);
        }

        System.out.println("-".repeat(20));
        System.out.println("1st rank");
        System.out.println("-".repeat(20));
//        System.out.println(sortedByMarks.last());
        Student firstRank = sortedByMarks.floor(new Student(null, 500));
        System.out.println(firstRank);

        System.out.println("-".repeat(20));
        System.out.println("Last mark");
        System.out.println("-".repeat(20));
//        System.out.println(sortedByMarks.first());
        Student lastRank = sortedByMarks.ceiling(new Student(null, 100));
        System.out.println(lastRank);

        System.out.println("-".repeat(20));
        System.out.println("Sorted by highest marks");
        System.out.println("-".repeat(20));
        Iterator<Student> studentIterator = sortedByMarks.descendingIterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        }

        System.out.println("-".repeat(20));
        System.out.println("2nd rank");
        System.out.println("-".repeat(20));
        System.out.println(sortedByMarks.lower(firstRank));

        System.out.println("-".repeat(20));
        System.out.println("2nd last rank");
        System.out.println("-".repeat(20));
        System.out.println(sortedByMarks.higher(lastRank));

        System.out.println("-".repeat(20));
        System.out.println("Students with mark > 400");
        System.out.println("-".repeat(20));
        SortedSet<Student> studentsWithMoreThan400 = sortedByMarks.subSet(new Student("XXX", 400), new Student("XXX", 501));
        studentsWithMoreThan400.forEach(System.out::println);

        //        studentsWithMoreThan400.add(new Student("SID21", 345));

        System.out.println("-".repeat(20));
        System.out.println("After removal");
        System.out.println("-".repeat(20));
        studentsWithMoreThan400.removeIf(student -> student.getId().startsWith("S"));
        System.out.println("Sub set");
        studentsWithMoreThan400.forEach(System.out::println);
        System.out.println("Original Set");
        sortedByMarks.forEach(System.out::println);

        System.out.println("-".repeat(20));
        System.out.println("Students with mark < 300");
        System.out.println("-".repeat(20));
        SortedSet<Student> studentsWithLessThan300 = sortedByMarks.subSet(new Student("XXX", 99), new Student("XXX", 300));
        studentsWithLessThan300.forEach(System.out::println);


    }

    private static List<Student> getStudents(int n) {
        List<Student> students = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <= n; i++) {
//            students.add(new Student(UUID.randomUUID(), random.nextInt(100, 501)));
            students.add(new Student("SID%03d".formatted(i), random.nextInt(100, 501)));
        }
        return students;
    }
}
