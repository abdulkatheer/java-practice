package org.example.functional_programming.function;

@FunctionalInterface
interface Function<T, R> {
    R map(T value);
}

@FunctionalInterface
interface BiFunction<T, U, R> {
    R map(T value1, U value2);
}


public class FunctionTest {
    public static void main(String[] args) {
        System.out.println(transform(value -> value.toUpperCase(), "Abdul"));
        System.out.println(transform(value -> value.repeat(2), "Abdul"));
        System.out.println(transform(value -> value.concat(" Katheer"), "Abdul"));

        System.out.println(transform((value1, value2) -> value1 + " is " + value2, "Katheer", 24));
    }

    private static String transform(Function<String, String> mapper, String value) {
        return mapper.map(value);
    }

    private static String transform(BiFunction<String, Integer, String> mapper, String value1, Integer value2) {
        return mapper.map(value1, value2);
    }
}
