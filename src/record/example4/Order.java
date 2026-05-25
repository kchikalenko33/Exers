package record.example4;

import java.util.List;

record Order(String orderId, String customerEmail, List<OrderItem> items) {
    public double getTotalAmount() {
        return items.stream()
                .mapToDouble(OrderItem::getTotal)
                .sum();
    }
}
