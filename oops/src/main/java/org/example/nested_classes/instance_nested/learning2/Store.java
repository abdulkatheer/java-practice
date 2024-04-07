package org.example.nested_classes.instance_nested.learning2;

public class Store {
    public static void main(String[] args) {
        Meal meal = new Meal();
        System.out.println(meal);

        Meal meal2 = new Meal(1.28);
        System.out.println(meal2);
    }
}
