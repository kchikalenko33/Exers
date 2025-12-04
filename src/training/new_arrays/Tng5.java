package training.new_arrays;

public class Tng5 {
    public static int topTwoNumber(int[] numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("Массив должен содержать минимум 2 элемента");
        }

        int max1 = numbers[0];
        int max2 = numbers[0];
        boolean foundSecond = false;

        for (int i = 1; i < numbers.length; i++) {
            int x = numbers[i];

            if (x > max1) {
                // новый максимум, старый максимум становится вторым
                max2 = max1;
                max1 = x;
                foundSecond = true;
            } else if (x < max1) {
                // кандидат на второй максимум (строго меньше max1)
                if (!foundSecond || x > max2) {
                    max2 = x;
                    foundSecond = true;
                }
            }
            // если x == max1 — просто игнорируем
        }

        if (!foundSecond) {
            throw new IllegalArgumentException("В массиве нет второго отличного максимума");
        }

        return max2;
    }


    public static void main(String[] args) {
        int[] a = {5, 5, 4, 3, 1};
        int[] b = {5, 4, 5, 3, 1};

        System.out.println(topTwoNumber(a)); // 4
        System.out.println(topTwoNumber(b)); // 4
    }
}
