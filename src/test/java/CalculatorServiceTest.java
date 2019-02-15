/**
 * @author Antonio Avila
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorServiceTest {

    @Test
    void add() {
        CalculatorService calculatorService = new CalculatorService();

        assertEquals(2.5,calculatorService.add(1,1.5));
        assertEquals(45,calculatorService.add(20,25));
    }

    @Test
    void subtract() {
        CalculatorService calculatorService = new CalculatorService();

        assertEquals(2.5,calculatorService.subtract(4,1.5));
        assertEquals(-600,calculatorService.subtract(300,900));
    }

    @Test
    void multiply() {
        CalculatorService calculatorService = new CalculatorService();

        assertEquals(2.5,calculatorService.multiply(1,2.5));
        assertEquals(774.72,calculatorService.multiply(12,64.56));
    }

    @Test
    void divide() {
        CalculatorService calculatorService = new CalculatorService();

        assertEquals(2.5,calculatorService.divide(5,2));
        assertEquals(79.68253968253968,calculatorService.divide(502,6.3));

    }
}