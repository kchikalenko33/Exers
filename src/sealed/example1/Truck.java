package sealed.example1;

final class Truck extends Vehicle{
    private double payloadCapacity;

    public Truck(String brand, int year, double payloadCapacity) {
        super(brand, year);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Грузовик " + brand + " громко завёлся.");
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }
}
