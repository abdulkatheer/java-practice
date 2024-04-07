package org.example.functional_programming.consumer;

import java.util.Arrays;

interface Consumer<T> {
    void consume(T value);
}

public class ConsumerTest {
    public static void main(String[] args) {
        doSomething((value -> System.out.println(value)), "message");
        doSomething(value -> {
            String result = String.join(",", value.split(""));
            System.out.println(result);
        }, "Katheer");
    }

    private static void doSomething(Consumer<String> job, String value) {
        job.consume(value);
    }
}
