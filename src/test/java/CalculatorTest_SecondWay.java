import org.Admon.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest_SecondWay {

    @Test
    public void testAddition() {
        double num1 = 5;
        double num2 = 3;
        int choice = 1;
        double expected = 8;
        double result = Calculator.performOperation(num1, num2, choice);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testSubtraction() {
        double num1 = 10;
        double num2 = 4;
        int choice = 2;
        double expected = 6;
        double result = Calculator.performOperation(num1, num2, choice);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testMultiplication() {
        double num1 = 6;
        double num2 = 2;
        int choice = 3;
        double expected = 12;
        double result = Calculator.performOperation(num1, num2, choice);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testDivision() {
        double num1 = 20;
        double num2 = 5;
        int choice = 4;
        double expected = 4;
        double result = Calculator.performOperation(num1, num2, choice);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testInvalidOperation() {
        double num1 = 8;
        double num2 = 2;
        int choice = 5; // Ungültige Operation
        double result = Calculator.performOperation(num1, num2, choice);
        assertEquals(Double.NaN, result, 0.001);
    }

    @Test
    public void testDivisionByZero() {
        double num1 = 10;
        double num2 = 0;
        int choice = 4; // Division durch Null
        double result = Calculator.performOperation(num1, num2, choice);
        assertEquals(Double.POSITIVE_INFINITY, result, 0.001);
    }
}
