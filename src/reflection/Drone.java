package reflection;

public class Drone extends Vehicle{
    private double batteryLevel;

    public Drone(double speed, double fuelConsumption, double batteryLevel) {
        super(speed, fuelConsumption);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void move() {
        System.out.println("Drone is flying at " + getSpeed() + " km/h with " + batteryLevel + "% battery.");
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }
}
