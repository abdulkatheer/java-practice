package org.example.mutability.deep_cloning;

import java.util.UUID;

public class Driver {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department(UUID.randomUUID(), "Client Tech");
        Employee employee = new Employee(UUID.randomUUID(), "Katheer", department);
        Company company = new Company(UUID.randomUUID(), "IG");
        company.addEmployee(employee);

        Company companyClone = company.clone();
        companyClone.addEmployee(new Employee(UUID.randomUUID(), "Hari", department));

        System.out.println("Original employee size=" + company.numberOfEmployees());
        System.out.println("Clone employee size=" + companyClone.numberOfEmployees());
    }
}
