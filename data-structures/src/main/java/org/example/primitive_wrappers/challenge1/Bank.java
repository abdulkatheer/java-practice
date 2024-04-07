package org.example.primitive_wrappers.challenge1;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public boolean addCustomer(String name) {
        Customer customer = new Customer(name);
        if (customers.contains(customer)) {
            return false;
        }
        customers.add(customer);
        return true;
    }

    public boolean addTransaction(String name, double transaction) {
        int i = customers.indexOf(new Customer(name));
        if (i == -1) {
            return false;
        }
        Customer customer = customers.get(i);
        customer.addTransaction(transaction);
        return true;
    }

    public void printStatement(String name) {
        int i = customers.indexOf(new Customer(name));
        if (i == -1) {
            return;
        }
        Customer customer = customers.get(i);
        System.out.println(customer);
    }
}
