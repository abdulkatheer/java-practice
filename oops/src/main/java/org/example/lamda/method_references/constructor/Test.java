package org.example.lamda.method_references.constructor;

import javax.swing.text.Style;

class Student {
    private String name;

    public Student() {
        name = "Test";
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

interface StudentFactory {
    Student get();
}

interface StudentFactory2 {
    Student get(String name);
}

public class Test {
    public static void main(String[] args) {
        Student s1 = build(Student::new);
        Student s2 = build(Student::new, "Katheer");
        System.out.println(s1);
        System.out.println(s2);
    }

    private static Student build(StudentFactory studentFactory) {
        return studentFactory.get();
    }

    private static Student build(StudentFactory2 studentFactory, String name) {
        return studentFactory.get(name);
    }
}
