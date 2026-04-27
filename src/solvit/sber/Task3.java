package solvit.sber;

public class Task3 {
    public static int maxPower(String s) {
        char[] ch = s.toCharArray();
        int localSeries = 1;
        int bestSeries = 0;

        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == ch[i + 1]) {
                localSeries++;
                if (localSeries > bestSeries) {
                    bestSeries = localSeries;
                }
            } else {
                localSeries = 1;
            }
        }

        return bestSeries;
    }

    public static void main(String[] args) {
        System.out.println(maxPower("aasssdfffffdfkjhfgh"));
    }
}
