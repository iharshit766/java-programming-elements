import java.util.Scanner;

public class KmToMiles2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // creating scanner object to take input

        System.out.print("enter distance in kilometers: "); // asking user to enter km
        double km = input.nextDouble(); // storing user input in km variable

        double miles = km / 1.6; // converting km to miles using formula

        System.out.println("the total miles is " + miles + " mile for the given " + km + " km"); // displaying result

        input.close(); // closing scanner to free resources
    }
}
