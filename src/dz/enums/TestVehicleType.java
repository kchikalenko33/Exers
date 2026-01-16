package dz.enums;

public class TestVehicleType {
    public static void main(String[] args) {
        VehicleType car = VehicleType.CAR;
        System.out.println(car.getName());
        System.out.println(car.getDetails());
        System.out.println(car.isHighSpeed());
        System.out.println(car);

        VehicleType motorcycle = VehicleType.byName("мотоцикл");
        System.out.println(motorcycle);

        VehicleType[] all = VehicleType.getAllTypes();
        System.out.println(all.length); // 5

        VehicleType.printAllTypes();

        VehicleType[] fastVehicles = VehicleType.getHighSpeedTypes();
        for (VehicleType v : fastVehicles) {
            System.out.println(v.getName());
        }
    }
}
