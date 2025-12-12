package practical_task.exam.autopark.persons;

import practical_task.exam.autopark.vehicles.Vehicle;

import java.util.Set;

public class TruckDriver extends Driver{
    private double maxManagedCargoCapacity;

    public TruckDriver(String firstName, String lastName, String licenseNumber,
                       Vehicle assignedVehicle, Set<String> driverCategories, double maxManagedCargoCapacity) {
        super(firstName, lastName, licenseNumber, assignedVehicle, driverCategories);
        this.maxManagedCargoCapacity = maxManagedCargoCapacity;
    }

    public TruckDriver(double maxManagedCargoCapacity) {
        this.maxManagedCargoCapacity = maxManagedCargoCapacity;
    }

    @Override
    public boolean matches(String query) {
        return false;
    }

    public double getMaxManagedCargoCapacity() {
        return maxManagedCargoCapacity;
    }

    public void setMaxManagedCargoCapacity(double maxManagedCargoCapacity) {
        this.maxManagedCargoCapacity = maxManagedCargoCapacity;
    }
}
