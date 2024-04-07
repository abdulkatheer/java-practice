package org.example.primitive_wrappers;

public class Part1 {
    public static void main(String[] args) {
//        Integer i = new Integer(10);
        Integer i = Integer.valueOf(10); // better performance due to caching

        Integer a1 = Integer.valueOf(20); // Manual boxing
        Integer a2 = 20; // Auto boxing, preferred

        int b1 = a1.intValue(); // Manual unboxing
        int b2 = a2; // Auto unboxing

        double c1 = getDoubleWrapperObject();
        Double c2 = getDoublePrimitive();
    }

    private static double getDoublePrimitive() {
        return 190.00;
    }

    private static Double getDoubleWrapperObject() {
        return Double.valueOf("200.00");
    }
}
