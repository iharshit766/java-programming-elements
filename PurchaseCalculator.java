import java.util.Scanner;

public class PurchaseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object for input

        // prompt user for input
        System.out.print("Enter the unit price (INR): ");
        double unitPrice = scanner.nextDouble(); // read unit price

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt(); // read quantity

        scanner.close(); // close scanner to prevent resource leak

        // calculate total price
        double totalPrice = unitPrice * quantity;

        // display result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }
}
