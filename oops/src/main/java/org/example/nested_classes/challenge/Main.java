package org.example.nested_classes.challenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Mohideen Abdul Katheer", "Mohamed Amsa", "15/07/2015");
        Employee e2 = new Employee("Dhanalakshmi", "Narayanan", "12/08/2015");
        Employee e3 = new Employee("Vinoth Kumar", "Natarajan", "30/06/2015");
        Employee e4 = new Employee("Hari", "Narayanan", "01/10/2015");

        doSomething(List.of(e1, e2, e3, e4));
    }

    private static void doSomething(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println();

        class EmployeeWrapper {
            private final Employee employee;

            EmployeeWrapper(Employee e) {
                this.employee = e;
            }

            String getFullName() {
                return employee.firstName() + " " + employee.lastName();
            }

            @Override
            public String toString() {
                return employee.toString();
            }
        }

        List<EmployeeWrapper> employeeWrappers = new ArrayList<>();
        for (Employee e : employees) {
            employeeWrappers.add(new EmployeeWrapper(e));
        }

        employeeWrappers.sort(new Comparator<EmployeeWrapper>() {
            @Override
            public int compare(EmployeeWrapper o1, EmployeeWrapper o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });

        for (EmployeeWrapper employeeWrapper : employeeWrappers) {
            System.out.println(employeeWrapper);
        }
    }
}
