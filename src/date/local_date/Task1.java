package date.local_date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату рождения в формате год месяц число");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        LocalDate nextBirthDate = LocalDate.of(today.getYear(), birthDate.getMonth(), birthDate.getDayOfMonth());

        if (nextBirthDate.isBefore(today) || nextBirthDate.equals(today)) {
            nextBirthDate = LocalDate.of(today.getYear() + 1, month, day);
        }

        int daysUntilBirthday = (int) ChronoUnit.DAYS.between(today, nextBirthDate);

        System.out.println(daysUntilBirthday);
    }
}
