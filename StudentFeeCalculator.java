import java.util.Scanner;

public class StudentFeeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // creating scanner object to take input

        System.out.print("enter the student fee: "); // asking user to enter fee
        double fee = input.nextDouble(); // storing user input in fee variable

        System.out.print("enter the discount percentage: "); // asking user to enter discount percentage
        double discountPercent = input.nextDouble(); // storing user input in discountPercent variable

        double discount = (fee * discountPercent) / 100; // calculating discount amount
        double finalFee = fee - discount; // calculating final fee after discount

        // displaying result
        System.out.println("the discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);

        input.close(); // closing scanner to free resources
    }
}
