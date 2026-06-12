package stream_api.group;

import java.time.LocalDate;

public record Transaction(String category, double amount, LocalDate date, boolean isSuccessful) {
}
