package reflection;

public class DeliveryService {
    public void deliver(Vehicle vehicle, Shipment shipment) {
        System.out.println("Доставка: " + shipment.getDestination());
        System.out.println("Вес изделия: " + shipment.getWeight() + " kg");
        System.out.println("Ориентировочная стоимость: $" + shipment.calculateDeliveryCost());

        vehicle.move();
        vehicle.refuel();
        System.out.println("---");
    }
}
