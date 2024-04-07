package org.example.nested_classes.instance_nested.learning2;

public class Meal {
    private double price = 5.0;
    private Burger burger;
    private Item drink;
    private Item side;
    private double fxRate;

    public Meal() {
        this(1);
    }

    public Meal(double fxRate) {
        burger = new Burger("regular");
        drink = new Item("coke", "drink", 1.5);
        System.out.println(drink.name);
        side = new Item("fried", "side", 2.0);
        this.fxRate = fxRate;
    }

    public double getTotal() {
        double total = burger.getPrice() + drink.price + side.price;
        return Item.getPrice(total, fxRate);
    }

    @Override
    public String toString() {
        return "%s%n%s%n%s%n%26s%.2f".formatted(burger, drink, side, "Total due: ", getTotal());
    }

    private class Item {
        private String name;
        private String type;
        private double price;

        public Item(String name, String type) {
            this(name, type, type.equals("burger") ? Meal.this.price : 0);
        }

        public Item(String name, String type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        @Override
        public String toString() {
            return "%10s%15s $%.2f".formatted(type, name, getPrice(price, fxRate));
        }

        private static double getPrice(double price, double rate) {
            return price * rate;
        }
    }

    private class Burger extends Item {
        Burger(String name) {
            super(name, "burger", 5.0);
        }

        double getPrice() {
            return super.price;
        }
    }
}
