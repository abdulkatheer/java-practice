package org.example.lamda.method_references.instance_method;


import java.util.function.BiConsumer;

class Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

interface StudentStringSetter {
    void set(Student s, String value);
}

public class Unbounded {
    public static void main(String[] args) {
        Student s = new Student();
        set((student, name) -> student.setName(name), s, "Katheer");
        System.out.println(s);
        set(Student::setName, s, "Dhanalakshmi");
        System.out.println(s);
        // Applicable only in a BinaryFunction
        // Where first arg is acting like this object and second arg is used as a arg in method call
    }

//    private static void set(StudentStringSetter setter, Student s, String value) {
//        setter.set(s, value);
//    }

    private static void set(BiConsumer<Student, String> setter, Student s, String value) {
        setter.accept(s, value);
    }
}
