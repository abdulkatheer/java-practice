package org.example.functional_interfaces;

@FunctionalInterface
public interface Flyable {
    static void doNothing() {

    }

    default void doSomething() {

    }

    private int sum() {
        return 0;
    }

    void foo();

}
