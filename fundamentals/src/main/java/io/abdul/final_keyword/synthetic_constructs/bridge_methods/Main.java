package io.abdul.final_keyword.synthetic_constructs.bridge_methods;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        int syntheticMethods = 0;
        Method[] methods = BridgeMethodDemo.class.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method: " + m.getName() + ", isSynthetic: " + m.isSynthetic() + ", isBridge: " + m.isBridge());
            if (m.isSynthetic()) {
                syntheticMethods++;
                System.out.println("The synthetic method in this class should also be a bridge method = " + m.isBridge());
            }
        }
        System.out.println("There should be exactly " + syntheticMethods + " synthetic bridge method in this class");
    }
}
