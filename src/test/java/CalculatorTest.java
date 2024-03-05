public class CalculatorTest {
    public static void main(String[] args) {
        testAddition();
        testSubtraction();
        testMultiplication();
        testDivision();
        testInvalidOperation();
        testDivisionByZero();
    }

    public static void testAddition() {
        double num1 = 5;
        double num2 = 3;
        int choice = 1;
        double expected = 8;
        double result = performOperation(num1, num2, choice);
        assert result == expected : "Addition test failed";
        System.out.println("Addition test passed");
    }

    public static void testSubtraction() {
        double num1 = 10;
        double num2 = 4;
        int choice = 2;
        double expected = 6;
        double result = performOperation(num1, num2, choice);
        assert result == expected : "Subtraction test failed";
        System.out.println("Subtraction test passed");
    }

    public static void testMultiplication() {
        double num1 = 6;
        double num2 = 2;
        int choice = 3;
        double expected = 12;
        double result = performOperation(num1, num2, choice);
        assert result == expected : "Multiplication test failed";
        System.out.println("Multiplication test passed");
    }

    public static void testDivision() {
        double num1 = 20;
        double num2 = 5;
        int choice = 4;
        double expected = 4;
        double result = performOperation(num1, num2, choice);
        assert result == expected : "Division test failed";
        System.out.println("Division test passed");
    }

    public static void testInvalidOperation() {
        double num1 = 8;
        double num2 = 2;
        int choice = 5;
        double result = performOperation(num1, num2, choice);
        assert Double.isNaN(result) : "Invalid operation test failed";
        System.out.println("Invalid operation test passed");
    }

    public static void testDivisionByZero() {
        double num1 = 10;
        double num2 = 0;
        int choice = 4;
        double result = performOperation(num1, num2, choice);
        assert Double.isInfinite(result) : "Division by zero test failed";
        System.out.println("Division by zero test passed");
    }

    public static double performOperation(double num1, double num2, int choice) {
        double result = 0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    result = Double.POSITIVE_INFINITY; // Division by zero
                }
                break;
            default:
                result = Double.NaN; // Invalid operation
                break;
        }
        return result;
    }
}
