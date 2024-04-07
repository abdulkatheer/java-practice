package org.example.mutability.deep_cloning;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Company implements Cloneable {
    // Immutable
    private final String name;
    // Immutable
    private final UUID id;
    // Mutable in addEmployee()
    private final List<Employee> employees;

    public Company(UUID id, String name) {
        this.name = name;
        this.id = id;
        this.employees = new ArrayList<>();
    }

    public Company(UUID id, String name, List<Employee> employees) {
        this.name = name;
        this.id = id;
        this.employees = new ArrayList<>(employees);
    }

    public void addEmployee(Employee newEmployee) {
        this.employees.add(newEmployee);
    }

    public int numberOfEmployees() {
        return employees.size();
    }

    // deep
    @Override
    public Company clone() throws CloneNotSupportedException {
        List<Employee> employeesCopy = new ArrayList<>();
        for (Employee employee : employees) {
            employeesCopy.add(employee.clone());
        }
        return new Company(id, name, employeesCopy);
    }


    // shallow
//    @Override
//    protected Company clone() throws CloneNotSupportedException {
//        return (Company) super.clone();
//    }
}
