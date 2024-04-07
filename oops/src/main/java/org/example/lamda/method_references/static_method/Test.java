package org.example.lamda.method_references.static_method;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Test {
    public static void main(String[] args) {
        System.out.println(operate(Test::add, 10, 20));
        System.out.println(operate(Test::subtract, 10, 20));
        System.out.println(operate(Test::modulo, 10, 20));
        System.out.println(operate(Test::multiply, 10, 20));
        System.out.println(operate(Test::divide, 10, 20));
    }

    private static int operate(BinaryOperator<Integer> operation, int value1, int value2) {
        return operation.apply(value1, value2);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int divide(int a, int b) {
        return a / b;
    }

    private static int modulo(int a, int b) {
        return a % b;
    }
}
