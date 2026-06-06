package reflection;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        DeliveryService service = new DeliveryService();

        Vehicle truck = new Truck(80.0, 15.0, 2000);
        Vehicle drone = new Drone(60.0, 0.5, 85.0);
        Vehicle bicycle = new Bicycle(20.0, 0.0);

        Shipment parcel = new Parcel(5.0, "Moscow", true);
        Shipment fragile = new FragileItem(2.0, "St. Petersburg");
        Shipment document = new Document(0.3, "Kazan");

        service.deliver(truck, parcel);
        service.deliver(drone, fragile);
        service.deliver(bicycle, document);

        Class<Truck> truckClass = Truck.class;
        System.out.println(truckClass.getSuperclass());

        Class<? extends Vehicle> truckClassObject = truck.getClass();
        System.out.println(truckClassObject.getSuperclass());

        Field field = truckClass.getDeclaredField("cargoCapacity");
        field.setAccessible(true);
        System.out.println(field.get(truck));

    }
}
