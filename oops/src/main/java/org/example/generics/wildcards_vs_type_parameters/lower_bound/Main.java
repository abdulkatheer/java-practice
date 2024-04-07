package org.example.generics.wildcards_vs_type_parameters.lower_bound;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10L);
        numbers.add(15f);
        numbers.add(20.0);

        addNumber(numbers, 150);
    }

    public static void addNumber(List<? super Integer> list, Integer number) {
        list.add(number);
    }
}
