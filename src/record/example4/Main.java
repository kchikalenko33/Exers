package record.example4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var items = List.of(
                new OrderItem("P001", 2, 25.99),
                new OrderItem("P002", 1, 49.99)
        );

        Order order = new Order("ORD-001", "customer@example.com", items);

        System.out.println("Order: " + order.orderId());
        System.out.println("Total: $" + order.getTotalAmount());
    }
}
