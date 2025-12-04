package dz.transport.interfaces;

public interface ElectricPowered {
    void chargeBattery(int percent);

    int getBatteryLevel();

    default boolean canDrive() {
        return getBatteryLevel() > 0;
    }
}
