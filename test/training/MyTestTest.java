package training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MyTestTest {
    private static MyTest test;

    @BeforeAll
    static void setUp() {
        test = new MyTest();
    }

    @Test
    @DisplayName("isEven проверка четного числа")
    void isEvenTrueTest() {
        boolean actual = test.isEven(2);
        Assertions.assertTrue(actual);
    }

    @Test
    @DisplayName("isEven проверка нечетного числа")
    void isEvenFalseTest() {
        boolean actual = test.isEven(3);
        Assertions.assertFalse(actual);
    }

    @Test
    @DisplayName("sum проверка суммы")
    void sumTest() {
        int actual = test.sum(2, 3);
        int expected = 5;
        String message = "2 + 3 = 5";
        Assertions.assertEquals(expected, actual, message);
    }

    @Test
    @DisplayName("sale проверка 10% скидки")
    void sale10PercentTest() {
        double actual = test.sale(110);
        double expected = 99;
        String message = "число с учетом скидки = 99";
        Assertions.assertEquals(expected, actual, message);
    }

    @Test
    @DisplayName("sale проверка 20% скидки")
    void sale20PercentTest() {
        double actual = test.sale(1100);
        double expected = 880;
        String message = "число с учетом скидки = 880";
        Assertions.assertEquals(expected, actual, message);
    }

    @Test
    @DisplayName("toUp проверка перевода в верхний регистр")
    void toUpTest() {
        String actual = test.toUp("asdf");
        String expected = "ASDF";
        Assertions.assertEquals(expected, actual, "Все ок");
    }

    @Test
    @DisplayName("sumArray проверка суммы элементов массива")
    void sumArrayTest() {
        int[] numbers = {1, 2, 3, 4, 5};
        int actual = test.sumArray(numbers);
        int expected = 15;
        String message = "Сумма элементов массива [1, 2, 3, 4, 5] = 15";
        Assertions.assertEquals(expected, actual, message);
    }

    @Test
    @DisplayName("multipleArray проверка возведения элементов в квадрат")
    void multipleArrayTest() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 4, 9, 16};
        int[] actual = test.multipleArray(input);

        Assertions.assertArrayEquals(expected, actual,
                "Каждый элемент массива должен быть возведён в квадрат");
    }
}