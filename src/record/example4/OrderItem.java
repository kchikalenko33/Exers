package record.example4;

public record OrderItem(String productId, int quantity, double price) {
    public double getTotal() {
        return quantity * price;
    }
}
