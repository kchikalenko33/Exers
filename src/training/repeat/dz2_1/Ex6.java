package training.repeat.dz2_1;

public class Ex6 {
    public static void translationIntoMorseCode(String phrase) {
        String[] alphabet = {"А", "Б", "В", "Г", "Д", "Е", "Ж", "З", "И", "Й", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц",
                "Ч", "Ш", "Щ", "Ъ", "Ы", "Ь", "Э", "Ю", "Я"};
        String[] morseCode = {".-", "-...", ".--", "--.", "-..", ".", "...-", "--..", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", ".-.", "...", "-", "..-", "..-.", "....", "-.-.", "---.", "----", "--.-", "--.--",
                "-.--", "-..-", "..-..", "..--", ".-.-"};
        StringBuilder result = new StringBuilder();

        for (char letter : phrase.toCharArray()) {
            int index = -1;

            for (int i = 0; i < alphabet.length; i++) {
                if (alphabet[i].charAt(0) == letter) {
                    index = i;
                    break;
                }
            }

            if (index != 1) {
                result.append(morseCode[index]).append(" ");
            }
        }

        System.out.println(result.toString().trim());
    }

    public static void main(String[] args) {
        String phrase = "ПРИВЕТ";
        translationIntoMorseCode(phrase);
    }
}
