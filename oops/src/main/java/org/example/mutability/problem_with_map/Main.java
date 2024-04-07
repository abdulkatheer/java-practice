package org.example.mutability.problem_with_map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> salutations = List.of("Mr ", "Ms ");

        List<StringBuilder> names = new ArrayList<>();
        names.add(new StringBuilder("Katheer"));
        names.add(new StringBuilder("Mr Katheer"));
        names.add(new StringBuilder("Dhanalakshmi"));
        names.add(new StringBuilder("Ms Dhanalakshmi"));

        Map<StringBuilder, Object> map = new HashMap<>();
        names.forEach(name -> map.put(name, new Object()));

        System.out.println("### Distinct when created ###");
        System.out.println(map);

        names.forEach(name -> {
            salutations.forEach(s -> {
                int i = name.indexOf(s);
                if (i > -1) {
                    name.replace(i, i + s.length(), "");
                }
            });
        });

        System.out.println("### After mutating keys ###");
        System.out.println(names);

        System.out.println("### Duplicate elements in Map after mutating keys ###");
        System.out.println(map);

        Object o = map.get(new StringBuilder("Dhanalakshmi")); // which one will come
        Object o1 = map.get(new StringBuilder("Katheer"));
    }
}
