package org.example.generics.wildcards_vs_type_parameters.unbounded;

import java.util.List;

public class Main {
    // Additionally, we cannot use bounds since our method produces (reads) and consumes (updates) the list.
    // In other words, the PECS rule cannot be applied here and we should use an unbounded type.
    public static void main(String[] args) {

    }

//    public static void swap(List<?> list, int srcIndex, int destIndex) {
//        list.set(srcIndex, list.set(destIndex, list.get(srcIndex)));
//    }

    private static <E> void swapHelper(List<E> list, int src, int des) {
        list.set(src, list.set(des, list.get(src)));
    }
}
