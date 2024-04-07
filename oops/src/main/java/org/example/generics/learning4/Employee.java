package org.example.generics.learning4;

public class Employee implements QueryItem, Comparable<QueryItem> {
    @Override
    public boolean matchField(String fieldName, String fieldValue) {
        return false;
    }

    @Override
    public int compareTo(QueryItem o) {
        return 0;
    }
}
