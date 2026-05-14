package road.level52;

import java.time.LocalDate;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        LocalDate curDate = LocalDate.now();
        // todo Stream.iterate(LocalDate.of(curDate.getYear(), curDate.getMonth(), 1), i -> i.isBefore())
    }
}
