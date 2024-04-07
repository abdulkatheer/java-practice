package org.example.linked_list.challenge2;

// NodeList
public interface NodeList {
    
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}