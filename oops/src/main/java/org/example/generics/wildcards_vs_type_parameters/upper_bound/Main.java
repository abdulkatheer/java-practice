package org.example.generics.wildcards_vs_type_parameters.upper_bound;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10L);
        numbers.add(15f);
        numbers.add(20.0);

        System.out.println(sum(numbers));
        System.out.println("-".repeat(20));
        System.out.println(sumWildcard(numbers));
        System.out.println("-".repeat(20));
        System.out.println(sumTypeParameter(numbers));
        System.out.println("-".repeat(20));
    }

    public static long sum(List<Number> numbers) {
        return numbers.stream().mapToLong(Number::longValue).sum();
    }

    public static long sumWildcard(List<? extends Number> numbers) {
        return numbers.stream().mapToLong(Number::longValue).sum();
    }

    public static <T extends Number> long sumTypeParameter(List<T> numbers) {
        return numbers.stream().mapToLong(Number::longValue).sum();
    }
}
