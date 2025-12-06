package training.new_arrays;

public class Tng8 {
    public static void main(String[] args) {
        String[] days = {"Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс"};
        String[] workDays = new String[5];

        System.out.println("Прямой порядок");
        for (String day : days) {
            System.out.println(day);
        }

        System.out.println();

        for (int i = days.length - 1; i >= 0; i--) {
            System.out.println(days[i]);
        }

        System.out.println();

        for (int i = 0; i < workDays.length; i++) {
            workDays[i] = days[i];
            System.out.println(workDays[i]);
        }
    }
}
