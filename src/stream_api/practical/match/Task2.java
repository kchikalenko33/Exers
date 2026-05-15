package stream_api.practical.match;

import java.util.List;

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

//        passwords.stream()
//                .allMatch(s -> {
//                    if (s.length() >= 6) {
//                    }
//                }
//                )
    }
}
