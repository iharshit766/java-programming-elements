import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object for input

        // prompt user for input
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt(); // read value of a

        System.out.print("Enter value for b: ");
        int b = scanner.nextInt(); // read value of b

        System.out.print("Enter value for c: ");
        int c = scanner.nextInt(); // read value of c

        scanner.close(); // close scanner to prevent resource leak

        // compute integer operations
        int result1 = a + b * c; // multiplication has higher precedence than addition
        int result2 = a * b + c; // multiplication has higher precedence than addition
        int result3 = c + a / b; // division has higher precedence than addition
        int result4 = a % b + c; // modulus has higher precedence than addition

        // display results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
