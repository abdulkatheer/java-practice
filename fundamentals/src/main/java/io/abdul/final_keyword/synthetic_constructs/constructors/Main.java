package io.abdul.final_keyword.synthetic_constructs.constructors;

import java.lang.reflect.Constructor;

public class Main {
    // these synthetic constructors are no longer generated starting with JDK 11.
    public static void main(String[] args) {
        int syntheticConstructors = 0;
        Constructor<?>[] constructors = SyntheticConstructorDemo.NestedClass
                .class.getDeclaredConstructors();
        System.out.println("This class should contain " + constructors.length + " only two constructors");

        for (Constructor<?> c : constructors) {
            System.out.println("Constructor: " + c.getName() + ", isSynthetic: " + c.isSynthetic());

            if (c.isSynthetic()) {
                syntheticConstructors++;
            }
        }

        System.out.println("This class should contain only one synthetic constructor = " + (syntheticConstructors == 1));
    }
}
