package date.local_date;

import java.time.LocalDate;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        LocalDate dec2026 = LocalDate.of(2026, 12, 1);
        LocalDate nextMonth = dec2026.plusMonths(1);

        System.out.println(nextMonth);
    }
}
