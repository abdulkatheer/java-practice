package org.example.functional_programming.predicate;

@FunctionalInterface
interface Predicate<T> {
    boolean test(T value);
}

@FunctionalInterface
interface BiPredicate<T, U> {
    boolean test(T value1, U value2);
}

public class PredicateTest {
    public static void main(String[] args) {
        System.out.println(validate(value -> value % 2 == 0, 10));
        System.out.println(validate(value -> value > 0, 10));

        System.out.println(validate((v1, v2) -> v1 < v2, 10, 20));
        System.out.println(validate((v1, v2) -> v1 >= v2, 10, 20));
    }

    private static boolean validate(Predicate<Integer> condition, Integer value) {
        return condition.test(value);
    }

    private static boolean validate(BiPredicate<Integer, Integer> condition, Integer value1, Integer value2) {
        return condition.test(value1, value2);
    }
}
