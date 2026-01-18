package training.comparator.product;

public class Product {
    private long id;
    private String name;
    private String category;
    private double price;
    private double rating;
    private boolean inStock;

    public Product(long id, String name, String category, double price, double rating, boolean inStock) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.rating = rating;
        this.inStock = inStock;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public boolean isInStock() {
        return inStock;
    }

    @Override
    public String toString() {
        return String.format("%s (%.2f руб., рейтинг: %.1f, %s)",
                name, price, rating, inStock ? "в наличии" : "нет в наличии");
    }
}
