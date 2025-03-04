import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object for input

        // prompt user for input
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble(); // read perimeter

        scanner.close(); // close scanner to prevent resource leak

        // calculate side length using formula: side = perimeter / 4
        double side = perimeter / 4;

        // display result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
