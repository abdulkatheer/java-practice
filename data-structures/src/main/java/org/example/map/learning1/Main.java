package org.example.map.learning1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = getStudents(10);

//        Map<String, Student> studentsStore = new HashMap<>();
        Map<String, Student> studentsStore = new LinkedHashMap<>();
        for (Student student : students) {
            studentsStore.put(student.getId(), student);
        }

        printValues(studentsStore);

        Student oldValue = studentsStore.put("SID001", new Student("DUMMY", 0, 0, 0, 0, 0));
        System.out.println(oldValue);

        printValues(studentsStore);

        System.out.println(studentsStore.get("SID100"));
        System.out.println(studentsStore.getOrDefault("SID100", new Student("DUMMY", 0, 0, 0, 0, 0)));

    }

    private static List<Student> getStudents(int n) {
        List<Student> students = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <= n; i++) {
            students.add(new Student("SID%03d".formatted(i), random.nextInt(0, 101),
                    random.nextInt(0, 101), random.nextInt(0, 101),
                    random.nextInt(0, 101), random.nextInt(0, 101)));
        }
        return students;
    }

    private static void printValues(Map<String, Student> studentMap) {
        System.out.println("-".repeat(100));
        studentMap.values().forEach(System.out::println);
        System.out.println("-".repeat(100));
    }
}
