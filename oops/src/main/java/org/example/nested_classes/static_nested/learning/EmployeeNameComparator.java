package org.example.nested_classes.static_nested.learning;

import java.util.Comparator;

public class EmployeeNameComparator<T extends Employee> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
