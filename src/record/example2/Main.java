package record.example2;

public class Main {
    public static void main(String[] args) {
        User validUser = new User("alex123", "password123");

        try {
            User invalidUser = new User("", "pass");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
