package date.local_date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Task3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate firstDayNextMonth = today.plusMonths(1).withDayOfMonth(1);

        System.out.println(firstDayNextMonth);
        System.out.println(ChronoUnit.DAYS.between(today, firstDayNextMonth));
    }
}
