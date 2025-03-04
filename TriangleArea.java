import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object for input

        // prompt user for input
        System.out.print("Enter base of the triangle in cm: ");
        double base = scanner.nextDouble(); // read base in cm
        
        System.out.print("Enter height of the triangle in cm: ");
        double height = scanner.nextDouble(); // read height in cm
        
        scanner.close(); // close scanner to prevent resource leak

        // calculate area in square cm
        double areaSqCm = 0.5 * base * height;
        
        // convert to square inches (1 inch = 2.54 cm, so 1 sq inch = 2.54 * 2.54 sq cm)
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        // display results
        System.out.println("The area of the triangle in sq inches is " + areaSqIn + " and in sq cm is " + areaSqCm);
    }
}
