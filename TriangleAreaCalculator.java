import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // creating scanner object to take input

        System.out.print("enter the base of the triangle in cm: "); // asking user to enter base
        double base = input.nextDouble(); // storing user input in base variable

        System.out.print("enter the height of the triangle in cm: "); // asking user to enter height
        double height = input.nextDouble(); // storing user input in height variable

        double areaCm = 0.5 * base * height; // calculating area in square cm
        double areaInches = areaCm / 6.4516; // converting square cm to square inches

        // displaying result
        System.out.println("the area of the triangle is " + areaCm + " square cm and " + areaInches + " square inches");

        input.close(); // closing scanner to free resources
    }
}
