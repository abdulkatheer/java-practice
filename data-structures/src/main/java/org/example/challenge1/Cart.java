package org.example.challenge1;

import java.time.LocalDate;
import java.util.Map;

public class Cart {
    private static int lastId = 1;

    private int id;
    private Map<String, Integer> products;
    private LocalDate date;
    private CartType type;

    public Cart(CartType type) {
        this(type, 0);
    }

    public Cart(CartType type, int days) {
        this.id = lastId++;
        this.type = type;
        this.date = LocalDate.now().minusDays(days);
    }

    public void addItem(InventoryItem item, int qty) {
        products.merge(item.getProduct().getSku(), qty, Integer::sum);
        if (!item.reserveItem(qty)) {
            System.out.println("Oops, can't reserve item!");
        }
    }

    public void removeItem(InventoryItem item, int qty) {
        String sku = item.getProduct().getSku();
        Integer currentQty = products.get(sku);
        if (currentQty == null) {
            System.out.println("Oops, no such item found!");
        } else {
            Integer qtyReduced;
            if (currentQty <= qty) {
                qtyReduced = products.remove(sku);
                System.out.println("Item removed completely!");
            } else {
                products.computeIfPresent(sku, (s, current) -> current - qty);
                qtyReduced = qty;
                System.out.println("Item qty reduced to " + products.get(sku));
            }
            item.releaseItem(qtyReduced);
        }
    }

    public void printSalesSlip(Map<String, InventoryItem> inventory) {
        double total = 0;
        System.out.println("-".repeat(30));
        System.out.println("Thank you for your sale: ");
        for (var cartItem : products.entrySet()) {
            InventoryItem item = inventory.get(cartItem.getKey());
            Integer qty = cartItem.getValue();
            double itemizedPrice = item.getSalesPrice() * qty;
            total += itemizedPrice;
            System.out.printf("\t%s %-10s (%d)@ $%.2f = $%.2f%n", cartItem.getKey(), item.getProduct().getName(),
                    qty, item.getSalesPrice(), itemizedPrice);
        }
        System.out.printf("Total sale: $%.2f%n", total);
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", products=" + products +
                ", date=" + date +
                '}';
    }
}
