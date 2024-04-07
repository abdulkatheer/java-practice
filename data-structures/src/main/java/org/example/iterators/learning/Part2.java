package org.example.iterators.learning;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Part2 {
    public static void main(String[] args) {
        List<String> movies = new LinkedList<>();
        movies.addAll(List.of("Visaranai", "Asuran", "Kaithi", "Alaipayuthey", "Jigarthanda", "Virumandi", "Vadachennai",
                "Indian", "Thuruvangal 16"));
        ListIterator<String> listIterator = movies.listIterator();
//        listIterator.previous();

        // Current index is 0, so next() would return 0th element and moves cursor to index 1
        System.out.println(listIterator.next());

        // previous return cursor - 1th element and moves cursor to cursor - 1, so 0th element
        System.out.println(listIterator.previous());

        listIterator.remove(); // should be called either after next() or previous(); removes result of prev operation;
//        listIterator.remove(); // can be called only once

        System.out.println(listIterator.next());

        ListIterator<String> listIterator2 = movies.listIterator();
        // cursor at 0
        while(listIterator2.hasNext()) {
            System.out.println(">>" + listIterator2.next());
        }
        // cursor at n
        while(listIterator2.hasPrevious()) {
            System.out.println("<<" + listIterator2.previous());
        }
        // cursor at 0
    }
}
