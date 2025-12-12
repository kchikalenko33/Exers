package practical_task.exam.autopark.persons;

import practical_task.exam.autopark.vehicles.Vehicle;

import java.util.Set;

public class CarDriver extends Driver{
    private int carDriverExperience;

    public CarDriver(String firstName, String lastName, String licenseNumber, Vehicle assignedVehicle,
                     Set<String> driverCategories, int carDriverExperience) {
        super(firstName, lastName, licenseNumber, assignedVehicle, driverCategories);
        this.carDriverExperience = carDriverExperience;
    }

    public CarDriver(int carDriverExperience) {
        this.carDriverExperience = carDriverExperience;
    }

    @Override
    public boolean matches(String query) {
        return false;
    }

    public int getCarDriverExperience() {
        return carDriverExperience;
    }

    public void setCarDriverExperience(int carDriverExperience) {
        this.carDriverExperience = carDriverExperience;
    }
}
