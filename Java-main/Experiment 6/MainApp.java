import ExceptionHandlingDemo.Calculator;
import ExceptionHandlingDemo.DivisionException;

public class MainApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        try {
            int result = calc.divide(10, 0); // Change second number to test
            System.out.println("Result: " + result);
        } catch (DivisionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
