package reflection;

public class Bicycle extends Vehicle{

    public Bicycle(double speed, double fuelConsumption) {
        super(speed, fuelConsumption);
    }

    @Override
    public void move() {
        System.out.println("Bicycle is pedaling at " + getSpeed() + " km/h.");
    }
}
