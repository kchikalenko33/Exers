package reflection;

public class Document extends Shipment{
    public Document(double weight, String destination) {
        super(weight, destination);
    }

    @Override
    public double calculateDeliveryCost() {
        // Документы лёгкие и дешёвые
        return Math.max(5.0, getWeight() * 1.1);
    }
}
