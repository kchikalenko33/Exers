package reflection;

public class FragileItem extends Shipment{
    public FragileItem(double weight, String destination) {
        super(weight, destination);
    }

    @Override
    public double calculateDeliveryCost() {
        // Хрупкие предметы дороже
        return getWeight() * 5.0 + 20.0;
    }
}
