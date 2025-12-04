package dz.transport.interfaces;

public interface CargoCarrier {
    void loadCargo(int weight);

    void unloadCargo(int weight);

    int getCurrentCargoWeight();

    int getMaxCargoWeight();

    default boolean hasFreeCapacity(int weight) {
        return getCurrentCargoWeight() + weight <= getMaxCargoWeight();
    }
}
