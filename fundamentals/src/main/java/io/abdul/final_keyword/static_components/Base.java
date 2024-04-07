package io.abdul.final_keyword.static_components;

public class Base {
    public static void recommendedMethod() {
        System.out.println("Base::recommendedMethod");
        optionalMethod();
        mandatoryMethod();
    }

    protected static void optionalMethod() {
        System.out.println("Base::optionalMethod");
    }

    private static void mandatoryMethod() {
        System.out.println("Base::mandatoryMethod");
    }
}
