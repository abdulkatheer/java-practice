package org.example.lamda.method_references.instance_method;

import java.util.function.Supplier;

public class Bounded {
    private int count;

    public void incrementCount() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Bounded t = new Bounded();
        t.incrementCount();
        System.out.println(doSomething(t::getCount));
        t.incrementCount();
        System.out.println(doSomething(t::getCount));
        t.incrementCount();
        System.out.println(doSomething(t::getCount));
    }

    private static int doSomething(Supplier<Integer> getter) {
        return getter.get();
    }
}
