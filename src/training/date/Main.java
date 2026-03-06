package training.date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate newYear = LocalDate.of(2027, 01,01);
        /*int count = 0;
        while (currentDate.isBefore(newYear)) {
            currentDate = currentDate.plusDays(1);
            count++;
        }
        System.out.println(count);*/

        System.out.println(Duration.between(currentDate.atStartOfDay(), newYear.atStartOfDay()).toDays());
        Duration delayDuration = Duration.ofHours(10).plusMinutes(30);
        System.out.println("Задержка: " + delayDuration.toHours() + ":" + delayDuration.toMinutesPart());
    }
}
