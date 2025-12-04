package dz.transport.model;

import dz.transport.interfaces.CargoCarrier;

public class Truck extends Vehicle implements CargoCarrier {

    private int currentCargoWeight;
    private int maxCargoWeight;

    public Truck(String model, String number, int maxSpeed, int maxCargoWeight) {
        super(model, number, maxSpeed);
        this.currentCargoWeight = 0;
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public void loadCargo(int weight) {
        if (hasFreeCapacity(weight)) {
            currentCargoWeight += weight;
            System.out.println("Груз загружен. Текущий вес: " + currentCargoWeight);
        } else {
            System.out.println("Нельзя загрузить груз — превышен лимит.");
        }
    }

    @Override
    public void unloadCargo(int weight) {
        if (currentCargoWeight >= weight) {
            currentCargoWeight -= weight;
            System.out.println("Груз разгружен. Текущий вес: " + currentCargoWeight);
        } else {
            System.out.println("Нельзя разгрузить больше, чем есть.");
        }
    }

    @Override
    public int getCurrentCargoWeight() {
        return currentCargoWeight;
    }

    @Override
    public int getMaxCargoWeight() {
        return maxCargoWeight;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель грузовика запущен.");
    }

    @Override
    public String getDetailedInfo() {
        return "Грузовик: " + getInfo() +
                ", Груз: " + currentCargoWeight + "/" + maxCargoWeight;
    }
}
