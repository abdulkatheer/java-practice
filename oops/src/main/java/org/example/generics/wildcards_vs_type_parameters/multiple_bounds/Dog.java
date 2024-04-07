package org.example.generics.wildcards_vs_type_parameters.multiple_bounds;

public class Dog extends Animal {

    public Dog(String type, String name) {
        super(type, name);
    }

    @Override
    public String makeSound() {
        return "Wuf";
    }

}