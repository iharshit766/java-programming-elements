import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object for input

        // prompt user for input
        System.out.print("Enter the first number (dividend): ");
        int number1 = scanner.nextInt(); // read first number

        System.out.print("Enter the second number (divisor): ");
        int number2 = scanner.nextInt(); // read second number

        scanner.close(); // close scanner to prevent resource leak

        // calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // display result
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);
    }
}
