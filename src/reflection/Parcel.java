package reflection;

public class Parcel extends Shipment{
    private boolean isInsured;

    public Parcel(double weight, String destination, boolean isInsured) {
        super(weight, destination);
        this.isInsured = isInsured;
    }

    @Override
    public double calculateDeliveryCost() {
        double baseCost = getWeight() * 2.5;
        return isInsured ? baseCost + 10.0 : baseCost;
    }

    public boolean isInsured() {
        return isInsured;
    }
}
