package reflection;

public abstract class Shipment implements Transportable {
    private double weight;
    private String destination;

    protected Shipment(double weight, String destination) {
        this.weight = weight;
        this.destination = destination;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String getDestination() {
        return destination;
    }

    // Абстрактный метод расчёта стоимости доставки
    public abstract double calculateDeliveryCost();
}
