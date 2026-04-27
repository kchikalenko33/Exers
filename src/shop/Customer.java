package shop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer {
    private Long id;
    private String name;
    private String phone;
    private String email;
    private DiscountCard discountCard;
    private Double sumOfTransactions = 0.0;
    private Map<Long, Transaction> transactions = new HashMap<>(); // история покупок

    public Customer(Long id, String name, String phone, String email, DiscountCard discountCard) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.discountCard = discountCard;
        this.sumOfTransactions = 0.0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DiscountCard getDiscountCard() {
        return discountCard;
    }

    public void setDiscountCard(DiscountCard discountCard) {
        this.discountCard = discountCard;
    }

    public Double getSumOfTransactions() {
        return sumOfTransactions;
    }

    public void setSumOfTransactions(Double sumOfTransactions) {
        this.sumOfTransactions = sumOfTransactions;
    }

    public void addTransactions(Transaction ... transactions) {
        for (int i = 0; i < transactions.length; i++) {
            this.transactions.put(transactions[i].getId(), transactions[i]);
        }
    }

    public Map<Long, Transaction> getTransactions() {
        return new HashMap<>(transactions);
    }

    public void addTransaction(Transaction transaction) {
        if (transaction != null) {
            transactions.put(transaction.getId(), transaction);
            sumOfTransactions += transaction.getProduct().getPrice() * transaction.getQuantity();
        }
    }

    public double getCashback() {
        if (discountCard == null) return 0.0;

        double cashback = 0.0;
        switch (discountCard) {
            case BRONZE:
                cashback = sumOfTransactions * 0.01; // 1 %
                break;
            case SILVER:
                cashback = sumOfTransactions * 0.03; // 3 %
                break;
            case GOLD:
                cashback = sumOfTransactions * 0.05; // 5 %
                break;
            case PLATINUM:
                cashback = sumOfTransactions * 0.1;  // 10 %
                break;
        }
        return cashback;
    }
}
