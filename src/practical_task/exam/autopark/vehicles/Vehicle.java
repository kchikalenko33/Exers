package practical_task.exam.autopark.vehicles;

import practical_task.exam.autopark.interfaces.Searchable;
import practical_task.exam.autopark.persons.Driver;

public abstract class Vehicle implements Searchable {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Driver assignedDriver;
    protected int year;
    protected Type type;
    protected Status status;

    protected Vehicle(String brand, String model, String registrationNumber, Driver assignedDriver, int year, Type type, Status status) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.assignedDriver = assignedDriver;
        this.year = year;
        this.type = type;
        this.status = status;
    }

    protected Vehicle() {
    }

    public void assignToDriver(Driver driver) {
        if (driver != null) {
            this.assignedDriver = driver;
        }
    }

    public void releaseFromDriver() {
        assignedDriver = null;
    }

    public String getVehicleDetails() {
        return "Бренд: " + brand + ", модель: " + model + ", номер: " + registrationNumber
                + ", год: " + year + ", статус: " + status;
    }

    public double calculateFuelConsumption(double distance) {
        double fuelEconomy = 11.4;

        return (distance * fuelEconomy) / 100;
    }
}
