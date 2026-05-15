package stream_api.practical;

public class Transaction {
    String category;
    double amount;

    public Transaction(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return category + ": $" + amount;
    }
}
