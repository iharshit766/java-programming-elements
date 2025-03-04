import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object for input

        // prompt user for input
        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble(); // read first number
        
        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble(); // read second number
        
        scanner.close(); // close scanner to prevent resource leak

        // perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number2 != 0 ? number1 / number2 : Double.NaN; // check for division by zero

        // display results
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + 
                           number1 + " and " + number2 + " is " + 
                           addition + ", " + subtraction + ", " + multiplication + ", and " + 
                           (number2 != 0 ? division : "undefined (division by zero)"));
    }
}
