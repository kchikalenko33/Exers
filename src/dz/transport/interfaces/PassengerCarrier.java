package dz.transport.interfaces;

public interface PassengerCarrier {
    void boardPassenger();

    void disembarkPassenger();

    int getPassengerCount();

    int getMaxPassenger();

    default boolean hasFreeSeats() {
        return getPassengerCount() < getMaxPassenger();
    }
}
