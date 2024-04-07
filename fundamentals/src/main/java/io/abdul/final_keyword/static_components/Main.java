package io.abdul.final_keyword.static_components;

public class Main {
    public static void main(String[] args) {
        Base b = new Base();
        b.recommendedMethod();
        System.out.println("-".repeat(30));
        Child c = new Child();
        c.recommendedMethod();
        System.out.println("-".repeat(30));
        Base bc = new Child();
        bc.recommendedMethod();
        System.out.println("-".repeat(30));
    }
}
