package org.example.nested_classes.local_class.learning1;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        for (Object o : stack) {
            System.out.println(o);
//            stack.pop();
        }
    }
}
