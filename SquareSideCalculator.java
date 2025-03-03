import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // creating scanner object to take input

        System.out.print("enter the perimeter of the square: "); // asking user to enter perimeter
        double perimeter = input.nextDouble(); // storing user input in perimeter variable

        double side = perimeter / 4; // calculating side length using formula

        // displaying result
        System.out.println("the length of the side is " + side + " whose perimeter is " + perimeter);

        input.close(); // closing scanner to free resources
    }
}
