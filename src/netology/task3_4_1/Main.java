package netology.task3_4_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Main main = new Main();
            main.fillUsers();

            System.out.println("Введите логин:");
            String login = scanner.nextLine();

            System.out.println("Введите пароль:");
            String pass = scanner.nextLine();

            try {
                User user = main.getUserByLoginAndPassword(login, pass);
                main.validateUser(user);
                System.out.println("Доступ предоставлен");
            } catch (UserNotFoundException | AccessDeniedException e) {
                System.err.println("Ошибка: " + e.getMessage());
            }

        }
    }

    public void fillUsers() {
        User user1 = new User("jhon", "jhon@gmail.com",  24);
        User user2 = new User("nikolay", "nikolay21",  11);
        users.add(user1);
        users.add(user2);
    }

    public User getUserByLoginAndPassword(String login, String password) {
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                if (user.getPassword().equals(password)) {
                    return user;
                } else {
                    throw new AccessDeniedException("Пароль не верный");
                }
            }
        }

        throw new UserNotFoundException("Пользователь не найден");
    }

    public void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException("Доступ запрещен - пользователю меньше 18 лет");
        }
    }

}
