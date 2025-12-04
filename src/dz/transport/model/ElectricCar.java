package dz.transport.model;

import dz.transport.interfaces.ElectricPowered;
import dz.transport.interfaces.PassengerCarrier;

public class ElectricCar extends Vehicle implements PassengerCarrier, ElectricPowered {

    private int passengerCount;
    private int maxPassengers;
    private int batteryLevel;

    public ElectricCar(String model, String number, int maxSpeed, int maxPassengers) {
        super(model, number, maxSpeed);
        this.maxPassengers = maxPassengers;
        this.passengerCount = 0;
        this.batteryLevel = 100;
    }

    // PassengerCarrier

    @Override
    public void boardPassenger() {
        if (hasFreeSeats()) {
            passengerCount++;
            System.out.println("Пассажир сел в электромобиль. Сейчас в машине: " + passengerCount);
        } else {
            System.out.println("Нет свободных мест в электромобиле.");
        }
    }

    @Override
    public void disembarkPassenger() {
        if (passengerCount > 0) {
            passengerCount--;
            System.out.println("Пассажир вышел из электромобиля. Сейчас в машине: " + passengerCount);
        } else {
            System.out.println("В электромобиле нет пассажиров.");
        }
    }

    @Override
    public int getPassengerCount() {
        return passengerCount;
    }

    @Override
    public int getMaxPassenger() {
        return maxPassengers;
    }

    // ElectricPowered

    @Override
    public void chargeBattery(int percent) {
        if (percent <= 0) {
            System.out.println("Нужно указывать положительное значение заряда.");
            return;
        }
        batteryLevel = Math.min(100, batteryLevel + percent);
        System.out.println("Батарея заряжена. Текущий заряд: " + batteryLevel + "%");
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    // Vehicle

    @Override
    public void startEngine() {
        if (canDrive()) {
            System.out.println("Электромотор запущен. Можно ехать.");
        } else {
            System.out.println("Батарея разряжена. Нельзя запустить электромобиль.");
        }
    }

    @Override
    public String getDetailedInfo() {
        return "Электромобиль: " + getInfo() +
                ", Пассажиры: " + passengerCount + "/" + maxPassengers +
                ", Заряд: " + batteryLevel + "%";
    }
}
