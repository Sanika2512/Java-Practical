import MathOperations.CeilOperation;
import MathOperations.FloorOperation;
import MathOperations.RoundOperation;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {5.3, 2.7, -3.8, 9.9};

        System.out.println("Math Operations:");
        for (double num : numbers) {
            System.out.println("\nOriginal Number: " + num);
            System.out.println("Floor: " + FloorOperation.apply(num));
            System.out.println("Ceil: " + CeilOperation.apply(num));
            System.out.println("Round: " + RoundOperation.apply(num));
        }
    }
}
