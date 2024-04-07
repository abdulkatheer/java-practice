package org.example.abstract_class.challenge1;

public class LgTv extends Product {
    public LgTv(String type, String description, double price) {
        super(type, description, price);
    }

    @Override
    public void showDetails() {
        System.out.printf("%s TV; %s; $%f%n", type, description, price);
    }
}
