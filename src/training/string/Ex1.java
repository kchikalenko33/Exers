package training.string;

public class Ex1 {
    public static void main(String[] args) {
        String fullName = "Петров Иван Максимович";

        if (fullName == null || fullName.trim().isEmpty()) {
            System.out.println(" ");
        }

        String[] parts = fullName.trim().split("\\s+");
        System.out.println(parts[0]);
    }
}
