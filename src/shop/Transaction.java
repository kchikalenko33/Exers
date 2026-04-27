package shop;

import java.time.LocalDateTime;
import java.util.Date;

public class Transaction {
    private Long id;
    private LocalDateTime date;
    private Product product;
    private int quantity;
    private Customer customer;
    private double totalPrice;

    public Transaction(Long id, LocalDateTime date, Product product, int quantity, Customer customer) {
        this.id = id;
        this.date = date != null ? date : LocalDateTime.now();
        this.product = product;
        validateQuantity(quantity);
        this.quantity = quantity;
        this.customer = customer;
        this.totalPrice = product.getPrice() * quantity;
    }

    private void validateQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Количество должно быть больше 0");
        }
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", date=" + date +
                ", product=" + product +
                ", quantity=" + quantity +
                ", customer=" + customer +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
