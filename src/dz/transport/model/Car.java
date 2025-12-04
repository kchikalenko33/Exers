package dz.transport.model;

import dz.transport.interfaces.PassengerCarrier;

public class Car extends Vehicle implements PassengerCarrier {

    private int passengerCount;
    private int maxPassengers;

    public Car(String model, String number, int maxSpeed, int maxPassengers) {
        super(model, number, maxSpeed);
        this.passengerCount = 0;
        this.maxPassengers = maxPassengers;
    }

    @Override
    public void boardPassenger() {
        if (hasFreeSeats()) {
            passengerCount++;
            System.out.println("Пассажир сел в автомобиль. Сейчас в машине: " + passengerCount);
        } else {
            System.out.println("Нет свободных мест в автомобиле.");
        }
    }

    @Override
    public void disembarkPassenger() {
        if (passengerCount > 0) {
            passengerCount--;
            System.out.println("Пассажир вышел из автомобиля. Сейчас в машине: " + passengerCount);
        } else {
            System.out.println("В автомобиле нет пассажиров.");
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

    @Override
    public void startEngine() {
        System.out.println("Двигатель автомобиля запущен.");
    }

    @Override
    public String getDetailedInfo() {
        return "Автомобиль: " + getInfo() +
                ", Пассажиры: " + passengerCount + "/" + maxPassengers;
    }
}
