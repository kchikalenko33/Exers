package training.comparator.employee;

import java.util.Comparator;

public class SurnameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2){
        String surname1 = extractSurname(e1.getFullName());
        String surname2 = extractSurname(e2.getFullName());

        if (surname1 == null && surname2 == null) return 0;
        if (surname1 == null) return -1;
        if (surname2 == null) return 1;

        return surname1.compareTo(surname2);
    }

    private String extractSurname(String fullName) {
        if(fullName == null || fullName.trim().isEmpty()) {
            return "";
        }

        String[] parts = fullName.trim().split("\\s+");
        return parts[0];
    }
}
