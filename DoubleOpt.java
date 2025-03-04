import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object for input

        // prompt user for input
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble(); // read value of a

        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble(); // read value of b

        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble(); // read value of c

        scanner.close(); // close scanner to prevent resource leak

        // compute double operations
        double result1 = a + b * c; // multiplication has higher precedence than addition
        double result2 = a * b + c; // multiplication has higher precedence than addition
        double result3 = c + a / b; // division has higher precedence than addition
        double result4 = a % b + c; // modulus has higher precedence than addition

        // display results
        Syste
