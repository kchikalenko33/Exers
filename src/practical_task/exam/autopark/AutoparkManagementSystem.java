package practical_task.exam.autopark;


import practical_task.exam.autopark.persons.Driver;
import practical_task.exam.autopark.vehicles.Vehicle;


import java.util.ArrayList;
import java.util.List;

public class AutoparkManagementSystem {
    private List<Vehicle> vehicles;
    private List<Driver> drivers;

    public AutoparkManagementSystem() {
        this.vehicles = new ArrayList<>();
        this.drivers = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicle == null || vehicles.contains(vehicle)) {
            return;
        }
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            return;
        }
        vehicles.remove(vehicle);
    }

    public void addDriver(Driver driver) {
        if (driver == null || drivers.contains(driver)) {
            return;
        }
        drivers.add(driver);
    }

    public void removeDriver(Driver driver) {
        if (driver == null) {
            return;
        }
        drivers.remove(driver);
    }

    public void assignVehicle(Driver driver, Vehicle vehicle) {
        if (driver == null || vehicle == null) return;
        if (vehicle.getAssignedDriver() != null) return;
        if (driver.getAssignedVehicle() != null) return;

        driver.assignVehicle(vehicle);
        vehicle.assignToDriver(driver);
    }

    public void releaseVehicle(Driver driver, Vehicle vehicle) {
        if (driver == null || vehicle == null) return;
        if (driver.getAssignedVehicle() != vehicle) return;

        driver.releaseVehicle();
        vehicle.releaseFromDriver();
    }

}
