package dz.enums;

public enum Season {

    WINTER("Зима", 12, 1, 2){
        @Override
        public String getDescription() {
            return super.getDescription();
        }
    },
    SPRING("Весна", 3, 4, 5),
    SUMMER("Лето", 6, 7, 8),
    AUTUMN("Осень", 9, 10, 11);

    private final String name;
    private final int startMonth;
    private final int midMonth;
    private final int lastMonth;

    Season(String name, int startMonth, int midMonth, int lastMonth) {
        this.name = name;
        this.startMonth = startMonth;
        this.midMonth = midMonth;
        this.lastMonth = lastMonth;
    }

    public String getName() {
        return name;
    }

    public int getStartMonth() {
        return startMonth;
    }

    public int getMidMonth() {
        return midMonth;
    }

    public int getLastMonth() {
        return lastMonth;
    }

    public String getDescription() {
        return String.format("%s (месяцы: %d-%d-%d)",
                name, startMonth, midMonth, lastMonth);
    }

    public int whenNewYear() {
        switch (this) {
            case WINTER: return 10;
            case SPRING: return 7;
            case SUMMER: return 4;
            case AUTUMN: return 1;

            default: return 0;
        }
    }

    public boolean containsMonth(int month) {
        return month == startMonth || month == midMonth || month == lastMonth;
    }

    @Override
    public String toString() {
        return name;
    }

    public static Season byMonth(int month) {
        if (month < 1 || month > 12) {
            return null;
        }

        for (Season season : Season.values()) {
            if (season.containsMonth(month)) {
                return season;
            }
        }

        return null;
    }

    public static Season[] getAllSeasons() {
        return Season.values();
    }

    public static void printAllSeasons() {
        for (Season season : Season.values()) {
            System.out.println(season.getDescription());
        }
    }
}
