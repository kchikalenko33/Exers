package training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import training.anonimInterface.MyClass;

public class MyClassTest {
    @Test
    @DisplayName("number проверка возведения в квадрат")
    void numberTest() {
        int actual = MyClass.Number(5);
        int expected = 25;
        String message = "5^2==25";

        Assertions.assertEquals(expected, actual, message);
    }

    @Test
    @DisplayName("number throw exception when = 1")
    void numberExceptionTest() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> MyClass.Number(1));
        Assertions.assertEquals("Ошибка, 1 не может быть",
                exception.getMessage(),
                "Не соответствие сообщений");
    }
}
