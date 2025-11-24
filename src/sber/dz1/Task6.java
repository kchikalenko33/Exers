package sber.dz1;

//Фронт со своей стороны не сделал обработку входных данных анкеты! Петя
//очень зол и ему придется написать свои проверки, а также кидать исключения,
//если проверка провалилась. Помогите Пете написать класс FormValidator со
//статическими методами проверки. На вход всем методам подается String str.
//        a. public void checkName(String str) — длина имени должна быть от 2 до 20
//символов, первая буква заглавная

public class Task6 {
    public static void checkName(String str) {
        if (str == null || str.length() < 2 || str.length() > 20) {
            throw new IllegalArgumentException("Длина строки должна быть в диапазоне от 2 до 20");
        } else if (!Character.isUpperCase(str.charAt(0))) {
            throw new IllegalArgumentException("Первая буква должна быть заглавной");
        }
    }

    public static void checkHeight(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("Рост не может быть null");
        }

        double height;

        try {
            height = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Рост должен быть числом");
        }

        if (height <= 0) {
            throw new IllegalArgumentException("Рост должен быть положительным");
        }
    }

    public static void main(String[] args) {
        checkName("Повпыво рывпр");
        checkHeight("5.01");
    }
}
