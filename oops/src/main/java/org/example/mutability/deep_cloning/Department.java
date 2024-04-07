package org.example.mutability.deep_cloning;

import java.util.UUID;

public class Department {
    // Immutable
    private UUID id;
    // Immutable
    private String name;

    public Department(UUID id, String name) {
        this.id = id;
        this.name = name;
    }
//
//    @Override
//    protected Department clone() throws CloneNotSupportedException {
//        return (Department) super.clone();
//    }
}
