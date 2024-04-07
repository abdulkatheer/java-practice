package org.example.lamda.learning2;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    // variable scope
    public static void main(String[] args) {
        String prefix = "Mr. ";

        List<String> names = List.of("Katheer", "Hari", "Vinoth", "Panu");

        Consumer<String> printName = s -> {
            System.out.println(prefix + s);
        };
        names.forEach(printName);
        doSomething(printName);
    }

    private static void doSomething(Consumer<String> printName) {
        printName.accept("Katheer");
    }
}
