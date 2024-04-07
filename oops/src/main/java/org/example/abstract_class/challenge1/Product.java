package org.example.abstract_class.challenge1;

public abstract class Product {
    protected String type;
    protected String description;
    protected double price;

    public Product(String type, String description, double price) {
        this.type = type;
        this.description = description;
        this.price = price;
    }

    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    public void printPricedLineItem(int quantity) {
        System.out.printf("%s x %d Nos == %f%n", type, quantity, getSalesPrice(quantity));
    }

    public abstract void showDetails();
}
