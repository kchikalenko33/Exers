package practical_task.exam.autopark.persons;

import practical_task.exam.autopark.interfaces.Searchable;
import practical_task.exam.autopark.vehicles.Vehicle;

import java.util.Set;

public abstract class Driver implements Searchable {
    protected String firstName;
    protected String lastName;
    protected String licenseNumber;
    protected Vehicle assignedVehicle;
    protected Set<String> driverCategories;

    protected Driver(String firstName, String lastName, String licenseNumber,
                     Vehicle assignedVehicle, Set<String> driverCategories) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.licenseNumber = licenseNumber;
        this.assignedVehicle = assignedVehicle;
        this.driverCategories = driverCategories;
    }

    protected Driver() {
    }

    public void assignVehicle(Vehicle vehicle) {
        if (vehicle != null) {
            this.assignedVehicle = vehicle;
        }
    }

    public void releaseVehicle(Vehicle vehicle) {
        this.assignedVehicle = null;
    }

    public String getDriverDetails() {
        return "Имя: " + firstName + ", фамилия: " + lastName + ", Номер лицензии: " + licenseNumber;
    }

    public Vehicle getAssignedVehicle() {
        return assignedVehicle;
    }



    public void releaseVehicle() {
        this.assignedVehicle = null;
    }
}
