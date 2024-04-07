package org.example.generics.wildcards_vs_type_parameters.multiple_bounds;

public class Cat extends Animal implements Comparable<Cat> {
    public Cat(String type, String name) {
        super(type, name);
    }

    @Override
    public String makeSound() {
        return "Meow";
    }

    @Override
    public int compareTo(Cat cat) {
        return this.getName().length() - cat.getName().length();
    }
}