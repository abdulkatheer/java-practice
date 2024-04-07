package org.example.nested_classes.instance_nested.learning;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<StoreEmployee> employees = new ArrayList<>(
                List.of(new StoreEmployee(1001, "Abdul", 2015, "Walmart"),
                        new StoreEmployee(1002, "Dhanalakshmi", 2016, "Walmart"),
                        new StoreEmployee(8008, "Vinoth", 2013, "Amazon"),
                        new StoreEmployee(1045, "Hari", 2018, "Flipkart"),
                        new StoreEmployee(1080, "Nirmal", 2022, "DMart"))
        );

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

        System.out.println("=By Store=");
        var genericEmployee = new StoreEmployee();
        var storeEmpComparator = genericEmployee.new StoreEmployeeComparator();
        employees.sort(storeEmpComparator);
        print(employees);

        System.out.println("=By Store=");
        employees.sort(new StoreEmployee().new StoreEmployeeComparator());
        print(employees);
    }

//    private static void print(List<Employee> employees) {
//        for (Employee e : employees) {
//            System.out.println(e);
//        }
//        System.out.println("-".repeat(20));
//    }

    private static void print(List<StoreEmployee> employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println("-".repeat(20));
    }
}
