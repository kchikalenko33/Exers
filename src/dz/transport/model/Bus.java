package dz.transport.model;

import dz.transport.interfaces.PassengerCarrier;

public class Bus extends Vehicle implements PassengerCarrier {

    private int passengerCount;
    private int maxPassengers;

    public Bus(String model, String number, int maxSpeed, int maxPassengers) {
        super(model, number, maxSpeed);
        this.passengerCount = 0;
        this.maxPassengers = maxPassengers;
    }

    @Override
    public void boardPassenger() {
        if (hasFreeSeats()) {
            passengerCount++;
            System.out.println("Пассажир сел в автобус. Сейчас в автобусе: " + passengerCount);
        } else {
            System.out.println("Нет свободных мест в автобусе.");
        }
    }

    @Override
    public void disembarkPassenger() {
        if (passengerCount > 0) {
            passengerCount--;
            System.out.println("Пассажир вышел из автобуса. Сейчас в автобусе: " + passengerCount);
        } else {
            System.out.println("В автобусе нет пассажиров.");
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
        System.out.println("Двигатель автобуса запущен.");
    }

    @Override
    public String getDetailedInfo() {
        return "Автобус: " + getInfo() +
                ", Пассажиры: " + passengerCount + "/" + maxPassengers;
    }
}
