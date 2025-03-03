import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // creating scanner object to take input

        System.out.print("enter the distance in feet: "); // asking user to enter distance in feet
        double distanceInFeet = input.nextDouble(); // storing user input in distanceInFeet variable

        double distanceInYards = distanceInFeet / 3; // converting feet to yards
        double distanceInMiles = distanceInYards / 1760; // converting yards to miles

        // displaying result
        System.out.println("the distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);

        input.close(); // closing scanner to free resources
    }
}
