package org.example.nested_classes.local_class.learning1;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class Stack implements Iterable<Object> {
    private final int maxSize;
    private final Object[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new Object[maxSize];
        top = -1;
    }

    public void push(Object value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }
        top++;
        stackArray[top] = value;
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        }
        int oldTop = top;
        top--;
        stackArray[oldTop] = null;
        return stackArray[oldTop];
    }

    public Object peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek element.");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    @Override
    public String toString() {
        return "Stack: " + Arrays.toString(stackArray);
    }

    @Override
    public Iterator<Object> iterator() {
        class StackIterator implements Iterator<Object> {
            final int currentTop = top;

            int i = top;

            @Override
            public boolean hasNext() {
                if (currentTop != top) {
                    throw new ConcurrentModificationException("Stack changed");
                }
                return i >= 0 && stackArray[i] != null;
            }

            @Override
            public Object next() {
                if (currentTop != top) {
                    throw new ConcurrentModificationException("Stack changed");
                }
                Object o = stackArray[i];
                i--;
                return o;
            }
        }

        return new StackIterator();
    }
}
