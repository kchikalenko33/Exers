package training.enums;

public enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }

    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.MONDAY;

        System.out.println(day.isWeekend());
    }

}
