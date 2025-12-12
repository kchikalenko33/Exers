package practical_task.exam.autopark;

import dz.transport.model.Vehicle;
import practical_task.exam.autopark.persons.Driver;

import java.util.ArrayList;
import java.util.List;

public class AutoparkManagementSystem {
    private List<Vehicle> vehicles;
    private List<Driver> drivers;

    public AutoparkManagementSystem() {
        this.vehicles = new ArrayList<>();
        this.drivers = new ArrayList<>();
    }
}
