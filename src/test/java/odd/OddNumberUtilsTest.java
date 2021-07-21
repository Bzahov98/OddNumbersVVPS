package odd;

import odd.exeption.InvalidParameterException;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.Executable;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OddNumberUtilsTest {

    @Test
    void sumOddNumbersInvalidLessThanZeroInput() {
        Throwable exception = assertThrows(InvalidParameterException.class,
                () -> OddNumberUtils.sumOddNumbers(-1, 100)
        );
        assertEquals("InvalidParameterException", exception.getMessage());
    }

    @Test
    void sumOddNumbersInvalidInput() {
        Throwable exception = assertThrows(InvalidParameterException.class,
                () -> OddNumberUtils.sumOddNumbers(12, 10)
        );
        assertEquals("InvalidParameterException", exception.getMessage());
    }

    @Test
    void sumOddNumbersFromZeroToN() throws InvalidParameterException {
        int sumOddTo100 = OddNumberUtils.sumOddNumbers(0, 100);
        assertEquals(sumOddTo100, 2500);
    }

    @Test
    void sumNoneOddNumbers() throws InvalidParameterException {
        int sumOdd = OddNumberUtils.sumOddNumbers(50, 50);
        assertEquals(sumOdd, 0);
    }

    @Test
    void sumOddNumbersFromNToM() throws InvalidParameterException {
        int sumOddTo100 = OddNumberUtils.sumOddNumbers(50, 53);
        assertEquals(sumOddTo100, 104);
    }
}