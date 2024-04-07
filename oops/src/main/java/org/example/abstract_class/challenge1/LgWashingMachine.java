package org.example.abstract_class.challenge1;

public class LgWashingMachine extends Product {
    public LgWashingMachine(String type, String description, double price) {
        super(type, description, price);
    }

    @Override
    public void showDetails() {
        System.out.printf("%s Washing Machine; %s; $%f%n", type, description, price);
    }
}
