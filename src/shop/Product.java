package shop;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Product {
    private Long id;
    private String name;
    private double price;
    private double weight;
    private LocalDate creationDate;
    private LocalDate expirationDate; // срок годности
    private Category category;

    public Product(Long id, String name, double price, double weight, LocalDate creationDate, LocalDate expirationDate,
                   Category category) {
        validateId(id);
        validateName(name);
        validatePrice(price);
        validateWeight(weight);
        validateDates(creationDate, expirationDate);

        this.id = id;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.creationDate = creationDate;
        this.expirationDate = expirationDate;
        this.category = category;
    }

    // Валидация ID
    private void validateId(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID не может быть null");
        }
    }

    // Валидация имени
    private void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Название товара не может быть пустым");
        }
    }

    // Валидация цены
    private void validatePrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Цена должна быть больше 0");
        }
    }

    // Валидация веса
    private void validateWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Вес должен быть больше 0");
        }
    }

    // Валидация дат
    private void validateDates(LocalDate creationDate, LocalDate expirationDate) {
        if (creationDate == null) {
            throw new IllegalArgumentException("Дата создания не может быть null");
        }
        if (expirationDate == null) {
            throw new IllegalArgumentException("Срок годности не может быть null");
        }
        if (expirationDate.isBefore(creationDate)) {
            throw new IllegalArgumentException("Срок годности не может быть раньше даты создания");
        }
    }

    // Геттеры и сеттеры с валидацией
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        validateId(id);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        validateName(name);
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        validatePrice(price);
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        validateWeight(weight);
        this.weight = weight;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        if (creationDate == null) {
            throw new IllegalArgumentException("Дата создания не может быть null");
        }
        validateDates(creationDate, this.expirationDate);
        this.creationDate = creationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        if (expirationDate == null) {
            throw new IllegalArgumentException("Срок годности не может быть null");
        }
        validateDates(this.creationDate, expirationDate);
        this.expirationDate = expirationDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        if (category == null) {
            throw new IllegalArgumentException("Категория не может быть null");
        }
        this.category = category;
    }

    // equals и hashCode на основе id
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", creationDate=" + creationDate +
                ", expirationDate=" + expirationDate +
                ", category=" + category +
                '}';
    }
}
