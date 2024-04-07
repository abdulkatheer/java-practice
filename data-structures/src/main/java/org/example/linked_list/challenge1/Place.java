package org.example.linked_list.challenge1;

public record Place(String name, int distance) {
    @Override
    public String toString() {
        return "[name=" + name + "]";
    }
}
