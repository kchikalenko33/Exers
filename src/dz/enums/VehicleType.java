package dz.enums;

public enum VehicleType {

        CAR("Автомобиль", 200, "Бензин"),
        MOTORCYCLE("Мотоцикл", 180, "Бензин"),
        BUS("Автобус", 90, "Дизель"),
        TRUCK("Грузовик", 110, "Дизель"),
        BIKE("Велосипед", 30, "Нет (мускульная сила)");

        private final String name;
        private final int maxSpeed;
        private final String fuelType;

        VehicleType(String name, int maxSpeed, String fuelType) {
            this.name = name;
            this.maxSpeed = maxSpeed;
            this.fuelType = fuelType;
        }

        public String getName() {
            return name;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public String getFuelType() {
            return fuelType;
        }

        public String getDetails() {
            return String.format("%s: макс. скорость %d км/ч, топливо — %s",
                    name, maxSpeed, fuelType);
        }

        public boolean isHighSpeed() {
            return maxSpeed > 100;
        }

        @Override
        public String toString() {
            return name;
        }

        public static VehicleType byName(String name) {
            if (name == null) {
                return null;
            }
            for (VehicleType type : VehicleType.values()) {
                if (type.getName().equalsIgnoreCase(name)) {
                    return type;
                }
            }
            return null;
        }

        public static VehicleType[] getAllTypes() {
            return VehicleType.values();
        }

        public static void printAllTypes() {
            for (VehicleType type : VehicleType.values()) {
                System.out.println(type.getDetails());
            }
        }

        public static VehicleType[] getHighSpeedTypes() {
            VehicleType[] all = VehicleType.values();
            int count = 0;
            for (VehicleType type : all) {
                if (type.isHighSpeed()) {
                    count++;
                }
            }

            VehicleType[] highSpeed = new VehicleType[count];
            int index = 0;
            for (VehicleType type : all) {
                if (type.isHighSpeed()) {
                    highSpeed[index++] = type;
                }
            }
            return highSpeed;
        }

}
