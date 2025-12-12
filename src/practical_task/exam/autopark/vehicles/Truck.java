package practical_task.exam.autopark.vehicles;

import practical_task.exam.autopark.persons.Driver;

public class Truck extends Vehicle{
    private double cargoCapacity;

    public Truck(String brand, String model, String registrationNumber,
                 Driver assignedDriver, int year, Type type, Status status, double cargoCapacity) {
        super(brand, model, registrationNumber, assignedDriver, year, type, status);
        this.cargoCapacity = cargoCapacity;
    }

    public Truck(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public boolean matches(String query) {
        return false;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}
