package org.example.abstract_class.challenge1;

import java.util.List;

public record Order(String orderId, List<OrderItem> orderItems) {
}
