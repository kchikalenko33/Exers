package sber.dz2_part1;

//Создать программу генерирующую пароль.
//На вход подается число N — длина желаемого пароля. Необходимо проверить,
//что N >= 8, иначе вывести на экран "Пароль с N количеством символов
//небезопасен" (подставить вместо N число) и предложить пользователю еще раз
//ввести число N.
//Если N >= 8 то сгенерировать пароль, удовлетворяющий условиям ниже и
//вывести его на экран. В пароле должны быть:
//● заглавные латинские символы
// ● строчные латинские символы
// ● числа
// ● специальные знаки(_*-)

import java.util.Random;

public class TaskDop1 {
    public static void generatePassword(int length) {
        String[] upperAlphabet = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
                "U", "V", "W", "X", "Y", "Z"
        };
        String[] lowerAlphabet = {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                "u", "v", "w", "x", "y", "z"
        };
        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] specialSymbols = {"_", "*", "-"};
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        password.append(upperAlphabet[random.nextInt(upperAlphabet.length)]);
        password.append(lowerAlphabet[random.nextInt(lowerAlphabet.length)]);
        password.append(digits[random.nextInt(digits.length)]);
        password.append(specialSymbols[random.nextInt(specialSymbols.length)]);
    }
}
