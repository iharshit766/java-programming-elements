import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // creating scanner object to take input

        System.out.print("enter first number: "); // asking user to enter first number
        double number1 = input.nextDouble(); // storing user input in number1 variable

        System.out.print("enter second number: "); // asking user to enter second number
        double number2 = input.nextDouble(); // storing user input in number2 variable

        double addition = number1 + number2; // performing addition
        double subtraction = number1 - number2; // performing subtraction
        double multiplication = number1 * number2; // performing multiplication
        double division = number1 / number2; // performing division

        // displaying results
        System.out.println("the addition, subtraction, multiplication and division value of 2 numbers " 
                            + number1 + " and " + number2 + " is " 
                            + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

        input.close(); // closing scanner to free resources
    }
}
