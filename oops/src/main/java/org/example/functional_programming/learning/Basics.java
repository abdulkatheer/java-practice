package org.example.functional_programming.learning;

import java.util.function.BinaryOperator;

public class Basics {
    public static void main(String[] args) {
        // if no type specified, type should not be specified for anything
        // if specific type specified, specific type should be specified for all
        // if var specified, var should be specified for all
        // Can't mix n match these three
        operate((a, b) -> a + b, 10, 20);
        operate((String a, String b) -> a + b, "Hello", "World");
        operate((var a, var b) -> a / b, 10.0, 2.5);


    }

    private static <T> void operate(BinaryOperator<T> operation, T value1, T value2) {
        operation.apply(value1, value2);
    }
}
