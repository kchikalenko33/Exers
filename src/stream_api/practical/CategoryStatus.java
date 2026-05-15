package stream_api.practical;

public class CategoryStatus {
    String category;
    int count;
    double totalAmount;

    public CategoryStatus(String category, int count, double totalAmount) {
        this.category = category;
        this.count = count;
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return category + ": " + count + " транзакции(й), общая сумма = $" + totalAmount;
    }
}
