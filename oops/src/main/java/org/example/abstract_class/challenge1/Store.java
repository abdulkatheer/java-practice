package org.example.abstract_class.challenge1;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Store {
    private List<Product> productsForSale;
    private List<Order> orders;

    public Store(List<Product> productsForSale) {
        this.productsForSale = productsForSale;
        this.orders = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productsForSale.add(product);
    }

    public String createOrder() {
        String orderId = UUID.randomUUID().toString();
        orders.add(new Order(orderId, new ArrayList<>()));
        return orderId;
    }

    public boolean addOrderItem(String orderId, OrderItem orderItem) {
        Order order = findOrder(orderId);
        if (order == null) {
            return false;
        }
        order.orderItems().add(orderItem);
        return true;
    }

    public void printOrder(String orderId) {
        Order order = findOrder(orderId);
        if (order == null) {
            return;
        }
        for (OrderItem oi : order.orderItems()) {
            oi.product().printPricedLineItem(oi.quantity());
        }
    }

    private Order findOrder(String orderId) {
        for (Order o : orders) {
            if (o.orderId().equals(orderId)) {
                return o;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product tv32Inch = new LgTv("LED", "32\" Android TV", 32_000.00);
        Product tv64Inch = new LgTv("OLED", "64\" OLED Smart TV", 65_000.00);
        Product topLoading = new LgWashingMachine("TOP_LOADING", "6.5Kg Top Loading Fully Automated Washing Machine", 39_799.00);
        Product semiAutomated = new LgTv("TOP_LOADING", "7.5Kg Top Loading Semi Automated Washing Machine", 17_000.00);

        Store annaiElectronics = new Store(List.of(tv32Inch, tv64Inch, topLoading, semiAutomated));
        String order = annaiElectronics.createOrder();
        annaiElectronics.printOrder(order);
        annaiElectronics.addOrderItem(order, new OrderItem(tv32Inch, 1));
        annaiElectronics.printOrder(order);
        annaiElectronics.addOrderItem(order, new OrderItem(topLoading, 1));
        annaiElectronics.printOrder(order);
    }
}
