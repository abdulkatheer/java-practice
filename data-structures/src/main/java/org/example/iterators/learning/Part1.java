package org.example.iterators.learning;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Part1 {
    public static void main(String[] args) {
        List<String> movies = new LinkedList<>();
        movies.addAll(List.of("Visaranai", "Asuran", "Kaithi", "Alaipayuthey", "Jigarthanda", "Virumandi", "Vadachennai",
                "Indian", "Thuruvangal 16"));
        Iterator<String> iterator = movies.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
