package org.example.nested_classes.instance_nested.learning;

import java.util.Comparator;

public class StoreEmployee extends Employee {
    private String store;

    public StoreEmployee() {
    }

    public StoreEmployee(int id, String name, int yearStarted, String store) {
        super(id, name, yearStarted);
        this.store = store;
    }

    public class StoreEmployeeComparator implements Comparator<StoreEmployee> {
        @Override
        public int compare(StoreEmployee o1, StoreEmployee o2) {
            int store = o1.store.compareTo(o2.store);
            if (store == 0) {
                return new Employee.EmployeeComparator("yearStarted").compare(o1, o2);
            }
            return store;
        }
    }

    @Override
    public String toString() {
        return "%-8s %s".formatted(store, super.toString());
    }
}
