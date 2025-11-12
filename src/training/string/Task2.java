package training.string;

public class Task2 {
    public static void main(String[] args) {
        String name = "Хорошо";
        System.out.println(name.replace('о', 'а'));
        String phrase = "яблоко и яблоко";
        System.out.println(phrase.replace("яблоко", "груша"));
        System.out.println(phrase.replaceFirst("яблоко", "груша"));

        String oneName = "приКОЛ";
        String twoName = "ПРИкол";

        System.out.println(oneName.equalsIgnoreCase(twoName));

        System.out.println(oneName.concat(twoName));

        String alphabet = "абвгдежзиклмнопрстуфхцчъьэюя";

        System.out.println(oneName.isEmpty());
        System.out.println(twoName.isBlank());
        System.out.println(alphabet.isBlank());

    }
}
