package org.example.nested_classes.static_nested.learning;

import java.util.ArrayList;
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

        employees.sort(new EmployeeNameComparator<>());
        print(employees);

        employees.sort(new Employee.EmployeeIdComparator());
        print(employees);

        System.out.println("=By Name=");
        employees.sort(new Employee.EmployeeComparator("name"));
        print(employees);

        System.out.println("=By ID=");
        employees.sort(new Employee.EmployeeComparator("id"));
        print(employees);

        System.out.println("=By Year Started=");
        employees.sort(new Employee.EmployeeComparator("yearStarted"));
        print(employees);
    }

    private static void print(List<Employee> employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println("-".repeat(20));
    }
}
