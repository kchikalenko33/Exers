package training.string;

//Дана строка. Нужно:
//вывести строку без начальных и конечных пробелов (используй trim())
//проверить, содержит ли строка только цифры (числовая ли она) — без использования
// регулярных выражений. Для этого пройдись по всем символам и проверь каждый через Character.isDigit()
//если строка числовая, вывести сумму всех её цифр
//если не числовая, вывести, сколько раз встречается буква 'о' (без учёта регистра)
//вывести строку, где каждая буква 'а' заменена на 'а' с подчёркиванием символа (например, "а_")
// — для этого можно использовать цикл и строить новую строку вручную

public class Task12 {
    public static void main(String[] args) {
        String phrase = "Перед импортом очистить 4содержимое таблиц trensf5erTariff и Transf3erTariffCoef2ficient";
        String trimmed = phrase.trim();

        System.out.println(trimmed);

        boolean isNumeric = true;

        for (int i = 0; i < trimmed.length(); i++) {
            if(!Character.isDigit(trimmed.charAt(i))) {
                isNumeric = false;
                break;
            }
        }

        if(isNumeric) {
            int sum = 0;

            for (int i = 0; i < trimmed.length(); i++) {
                sum += Character.getNumericValue(trimmed.charAt(i));
            }
                System.out.println("Сумма цифр равна - " + sum);
        } else {
            int countO = 0;

            for (int i = 0; i < trimmed.length(); i++) {
                char ch = Character.toLowerCase(trimmed.charAt(i));
                if (ch == 'о') {
                    countO++;
                }
            }
            System.out.println("Количество о - " + countO);
        }
        StringBuilder replaced = new StringBuilder();
        for (int i = 0; i < trimmed.length(); i++) {
            char ch = trimmed.charAt(i);
            if (ch == 'а') {
                replaced.append("а_");
            } else {
                replaced.append(ch);
            }
        }
        System.out.println("Строка с заменой 'а' на 'а_': " + replaced.toString());
    }
}
