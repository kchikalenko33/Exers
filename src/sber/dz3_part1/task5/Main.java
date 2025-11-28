package sber.dz3_part1.task5;

public class Main {
    public static void main(String[] args) {
        DayOfWeek[] days = new DayOfWeek[7];

        days[0] = new DayOfWeek((byte) 1, "Monday");
        days[1] = new DayOfWeek((byte) 2, "Tuesday");
        days[2] = new DayOfWeek((byte) 3, "Wednesday");
        days[3] = new DayOfWeek((byte) 4, "Thursday");
        days[4] = new DayOfWeek((byte) 5, "Friday");
        days[5] = new DayOfWeek((byte) 6, "Saturday");
        days[6] = new DayOfWeek((byte) 7, "Sunday");

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
    }
}
