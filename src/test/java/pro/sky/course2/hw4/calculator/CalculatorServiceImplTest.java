package pro.sky.course2.hw4.calculator;

import org.junit.jupiter.api.Test;
import pro.sky.course2.hw4.calculator.exception.ZeroDivideException;
import pro.sky.course2.hw4.calculator.service.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.course2.hw4.calculator.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldReturn6WhenSum2And4() {
        assertEquals(SIX, out.getSum(TWO, FOUR));
    }

    @Test
    public void shouldReturn8WhenSum6And2() {
        assertEquals(EIGHT, out.getSum(SIX, TWO));
    }

    @Test
    public void shouldReturn2WhenMinus6And4() {
        assertEquals(TWO, out.getMinus(SIX, FOUR));
    }

    @Test
    public void shouldReturn4WhenMinus6And2() {
        assertEquals(FOUR, out.getMinus(SIX, TWO));
    }

    @Test
    public void shouldReturn4WhenMultiply2And2() {
        assertEquals(FOUR, out.getMultiply(TWO, TWO));
    }

    @Test
    public void shouldReturn8WhenMultiply2And4() {
        assertEquals(EIGHT, out.getMultiply(TWO, FOUR));
    }

    @Test
    public void shouldReturn2WhenDivide4And2() {
        assertEquals(TWO, out.getDivide(FOUR, TWO));
    }

    @Test
    public void shouldReturn4WhenDivide8And2() {
        assertEquals(FOUR, out.getDivide(EIGHT, TWO));
    }

    @Test
    public void shouldThrowZeroDivideExceptionWhenDivideSecondNum0() {
        assertThrows(ZeroDivideException.class, () -> out.getDivide(EIGHT, ZERO));
    }
}
