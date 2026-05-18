package stream_api.practical.match;

import java.util.List;
import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {

//        Условия для валидного пароля:
//        Длина не менее 6 символов
//        Содержит хотя бы одну цифру
//        Содержит хотя бы один специальный символ (! @ # $ % & *)
//        Не должен содержать слово "weak"
//        Задача:
//        Используя матчеры, проверить:
//        allMatch — все ли пароли валидны?
//        anyMatch — есть ли хотя бы один валидный пароль?
//        noneMatch — нет ли пароля короче 4 символов?

        List<String> passwords = List.of("Pass123!", "weak", "StrongP@ss1", "123", "Valid1@");

        Predicate<String> isValidPassword = password -> {
            if (password.length() < 6) return false;
            if (password.contains("weak")) return false;
            if (!password.matches(".*\\d.*")) return false;
            if (!password.matches(".*[!@#$%&*].*")) return false;
            return true;
        };

        boolean allValid = passwords.stream()
                .allMatch(isValidPassword);

        boolean anyValid = passwords.stream()
                .anyMatch(isValidPassword);

        boolean noneValid = passwords.stream()
                .noneMatch(isValidPassword);

        System.out.println(allValid);
        System.out.println(anyValid);
        System.out.println(noneValid);
    }
}
