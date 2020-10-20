import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticTest {
    Arithmetic arithmetic = new Arithmetic();

    @Test
    void callLambdaAsInstanceVariable() {
        assertEquals(30, arithmetic.callLambdaAsInstanceVariable(7, 3));
    }

    @Test
    void createSumAndDivider() {
        assertEquals(2, arithmetic.createSumAndDivider(5).operate(7, 3));
    }

    @Test
    void calculateResult() {
        assertEquals(7, arithmetic.calculateResult(2, 3));
    }

}