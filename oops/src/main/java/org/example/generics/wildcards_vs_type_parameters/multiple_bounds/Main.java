package org.example.generics.wildcards_vs_type_parameters.multiple_bounds;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static <T extends Animal & Comparable<T>> void order(List<T> list) {
        list.sort(Comparable::compareTo);
    }
}
