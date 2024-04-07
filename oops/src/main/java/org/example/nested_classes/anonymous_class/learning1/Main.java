package org.example.nested_classes.anonymous_class.learning1;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(
                List.of(new Employee(1001, "Abdul", 2015),
                        new Employee(1002, "Dhanalakshmi", 2016),
                        new Employee(8008, "Vinoth", 2013),
                        new Employee(1045, "Hari", 2018),
                        new Employee(1080, "Nirmal", 2022))
        );

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.valueOf(o1.getId()).compareTo(o2.getId());
            }
        });
        print(employees);
    }

    private static void print(List<Employee> employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println("-".repeat(20));
    }
}
