package code_mu.level1;

public class Task1_5 {
    public static void main(String[] args) {
        String oneWord = "Машина";
        String secondWord = "Автомобиль";

        char oneWordSymbol = Character.toLowerCase(oneWord.charAt(0));
        char secondWordSymbol = Character.toLowerCase(secondWord.charAt(0));

        if (oneWordSymbol == secondWordSymbol) {
            System.out.println("Первые буквы слов совпадают");
        } else {
            System.out.println("Первые буквы слов не совпадают");
        }
    }
}
