package org.example.generics.challenge1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class QueryList<T extends Student & QueryItem> extends ArrayList<T> {
    public QueryList() {
    }

    public QueryList(List<T> c) {
        super(c);
    }

    public QueryList<T> getMatches(String field, String value) {
        QueryList<T> matches = new QueryList<>();
        for (T item : this) {
            if (item.matchField(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }

    public static <T extends Student & QueryItem> QueryList<T> getMatches(List<T> items, String field, String value) {
        QueryList<T> matches = new QueryList<>();
        for (T item : items) {
            if (item.matchField(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }
}
