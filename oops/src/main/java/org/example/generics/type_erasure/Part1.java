package org.example.generics.type_erasure;

import java.util.List;

public class Part1 {
    public static void main(String[] args) {
        print(List.of("Abdul", "Katheer", "Dhanalakshmi"));
        print(List.of(1, 2, 3, 4));
    }

//    public static void print(List<String> data) {
//        for (String datum : data) {
//            System.out.println(datum.toUpperCase());
//        }
//    }
//
//    public static void print(List<Integer> data) {
//        for (Integer datum : data) {
//            System.out.println(datum.floatValue());
//        }
//    }

    public static void print(List<?> data) {
        for (Object datum : data) {
            if (datum instanceof Integer i) {
                System.out.println(i.floatValue());
            } else if (datum instanceof String s) {
                System.out.println(s.toUpperCase());
            }
        }
    }
}
