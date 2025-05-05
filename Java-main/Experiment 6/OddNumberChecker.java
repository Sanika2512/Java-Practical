class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class OddNumberChecker {

    // Method to check if number is even
    public static void checkEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("The number " + number + " is odd!");
        } else {
            System.out.println("The number " + number + " is even.");
        }
    }

    public static void main(String[] args) {
        int num = 7; // you can change this to test with other numbers

        try {
            checkEven(num);
        } catch (OddNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
