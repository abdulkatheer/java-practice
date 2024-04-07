package org.example.mutability.deep_cloning;

import java.util.UUID;

public class Employee implements Cloneable {
    // Immutable
    private final UUID id;
    // Immutable
    private final String name;
    // Immutable
    private final Department department;

    public Employee(UUID id, String name, Department department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    protected Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}
