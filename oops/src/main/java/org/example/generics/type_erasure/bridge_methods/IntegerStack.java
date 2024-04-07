package org.example.generics.type_erasure.bridge_methods;

import java.util.ArrayList;
import java.util.List;

public class IntegerStack extends Stack<Integer> {

    public IntegerStack(int capacity) {
        super(capacity);
    }

    @Override
    public void push(Integer value) {
        super.push(value);
    }

    public static void main(String[] args) {
        Stack s = new IntegerStack(10);
        s.push(1);
//        s.push("Hello");
        // it'll fail bcz, Java created a bridge method in
        // IntegrerStack which will cast and call Integer push method

        List ints = new ArrayList<Integer>();
        ints.add("String"); // No polymorphism here, so it'll work

        List ints1 = new IntegerList();
        ints1.add(1);
        // call will go to Object method always, as there is no Integer method in parent class
        // from there it'll go to type specific method
//        ints1.add("String");
        // it'll fail bcz, Java created a bridge method in
        // IntegrerList which will cast and call Integer push method
    }
}

class Stack<E> {
    private E[] stackContent;

    public Stack(int capacity) {
        this.stackContent = (E[]) new Object[capacity];
    }

    public void push(E data) {
        // ..
    }

    public E pop() {
        // ..
        return stackContent[0];
    }
}

class IntegerList extends ArrayList<Integer> {
    @Override
    public boolean add(Integer integer) {
        return super.add(integer);
    }
}