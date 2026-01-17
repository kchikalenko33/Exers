package training.enums;

public enum VehicleType {
    CAR(200),
    MOTORCYCLE(300),
    BUS(120),
    TRUCK(110),
    BICYCLE(40);

    private final int maxSpeed;

    VehicleType(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public static void main(String[] args) {
        for (VehicleType vehicle : VehicleType.values()) {
            System.out.println("Тип " + vehicle.name() + " макс. скорость: " + vehicle.getMaxSpeed());
        }
    }
}
