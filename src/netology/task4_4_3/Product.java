package netology.task4_4_3;

import java.math.BigDecimal;

public class Product implements Comparable<Product> {
    private String name;
    private BigDecimal cost;
    private double relevance;

    public Product(String name, BigDecimal cost, double relevance) {
        this.name = name;
        this.cost = cost;
        this.relevance = relevance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public double getRelevance() {
        return relevance;
    }

    public void setRelevance(double relevance) {
        this.relevance = relevance;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", relevance=" + relevance +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        int rel = Double.compare(o.getRelevance(), this.getRelevance());
        if (rel == 0) {
            rel = o.getName().compareTo(this.getName());
        }
        return rel;
    }
}
