package code_mu.level1;

public class Task3_4 {
    public static void main(String[] args) {
        byte num = 1;

        String season;
        if (num == 12 || num == 1 || num == 2) {
            season = "Зима";
        } else if (num >= 3 && num <= 5) {
            season = "Весна";
        } else if (num >= 6 && num <= 8) {
            season = "Лето";
        } else if (num >= 9 && num <= 11) {
            season = "Осень";
        } else {
            season = "Некорректный номер месяца";
        }

        System.out.println(season);
    }
}
