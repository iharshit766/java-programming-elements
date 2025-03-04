import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object for input

        // prompt user for input
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble(); // read input

        scanner.close(); // close scanner to prevent resource leak

        // conversion factors
        double distanceInYards = distanceInFeet / 3; // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760; // 1 mile = 1760 yards

        // display results
        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
    }
}
