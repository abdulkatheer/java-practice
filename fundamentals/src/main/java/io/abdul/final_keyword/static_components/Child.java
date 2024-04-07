package io.abdul.final_keyword.static_components;

public class Child extends Base {
    // static can also be final, means subclasses can't hide this method
    public final static void recommendedMethod() {
        System.out.println("Child::recommendedMethod");
        optionalMethod();
        mandatoryMethod();
    }

    protected static void optionalMethod() {
        System.out.println("Child::optionalMethod");
    }

    private static void mandatoryMethod() {
        System.out.println("Child::mandatoryMethod");
    }
}
