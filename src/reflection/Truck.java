package reflection;

public class Truck extends Vehicle{
    private int cargoCapacity;

    public Truck(double speed, double fuelConsumption, int cargoCapacity) {
        super(speed, fuelConsumption);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void move() {
        System.out.println("Грузовик едет по дороге " + getSpeed() + " км/ч.");
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }
}
