import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // creating scanner object to take input

        System.out.print("enter your height in centimeters: "); // asking user to enter height in cm
        double heightCm = input.nextDouble(); // storing user input in heightCm variable

        double totalInches = heightCm / 2.54; // converting cm to inches
        int feet = (int) (totalInches / 12); // converting inches to feet
        double inches = totalInches % 12; // getting remaining inches

        // displaying result
        System.out.println("your height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);

        input.close(); // closing scanner to free resources
    }
}
