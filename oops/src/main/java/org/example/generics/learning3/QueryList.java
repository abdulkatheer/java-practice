package org.example.generics.learning3;

import java.util.ArrayList;
import java.util.List;



public class QueryList<T extends QueryItem> {
    private List<T> items;

    public QueryList(List<T> items) {
        this.items = items;
    }

    public List<T> getMatches(String field, String value) {
        List<T> matches = new ArrayList<>();
        for (T item : items) {
            if (item.matchField(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }

    public static <T extends QueryItem> List<T> getMatches(List<T> items, String field, String value) {
        List<T> matches = new ArrayList<>();
        for (T item : items) {
            if (item.matchField(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }
}
