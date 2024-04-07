package org.example.functional_programming.supplier;

import java.util.Random;

interface Supplier<T> {
    T supply();
}

public class SupplierTest {
    public static void main(String[] args) {
        System.out.println(get(() -> new Random().nextInt(10000)));
        System.out.println(get(() -> 100_00_00_000));
    }

    private static Integer get(Supplier<Integer> operation) {
        return operation.supply();
    }
}
