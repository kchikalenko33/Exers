package record.example3;

public record Product(String name, double price, String category) {
    public String getFormattedInfo() {
        return String.format("%s [%s]: $%.2f", name, category, price);
    }

    public boolean isExpensive() {
        return price > 1000;
    }
}
