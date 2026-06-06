package reflection;

public abstract class Vehicle {
    private double speed;
    private double fuelConsumption;

    protected Vehicle(double speed, double fuelConsumption) {
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
    }

    public abstract void move();

    public void refuel() {
        System.out.println("ТС заправлено.");
    }

    public double getSpeed() {
        return speed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

}
