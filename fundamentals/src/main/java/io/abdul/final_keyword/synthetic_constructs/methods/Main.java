package io.abdul.final_keyword.synthetic_constructs.methods;

import java.lang.reflect.Method;

public class Main {
    // these synthetic methods are no longer generated starting with JDK 11.
    public static void main(String[] args) {
        Method[] methods = SyntheticMethodDemo.NestedClass.class
                .getDeclaredMethods();
        System.out.println("This class should contain " + methods.length + " methods");

        for (Method m : methods) {
            System.out.println("Method: " + m.getName() + ", isSynthetic: " + m.isSynthetic());
        }
    }
}
