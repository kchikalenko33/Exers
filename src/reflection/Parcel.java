package reflection;

public class Parcel extends Shipment{
    private boolean isInsured;
    private final String NAME = "ASD";
    private int sum;
    public double avg;

    public Parcel(double weight, String destination, boolean isInsured) {
        super(weight, destination);
        this.isInsured = isInsured;
    }

    private void parcelMood() {
        System.out.println("Mood");
    }

    private int parcelCalc(int a, int b) {
        return a + b;
    }

    @Override
    public double calculateDeliveryCost() {
        double baseCost = getWeight() * 2.5;
        return isInsured ? baseCost + 10.0 : baseCost;
    }

    public boolean isInsured() {
        return isInsured;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "isInsured=" + isInsured +
                ", NAME='" + NAME + '\'' +
                ", sum=" + sum +
                ", avg=" + avg +
                '}';
    }
}
