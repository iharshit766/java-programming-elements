public class KMToMiles {
    public static void main(String[] args) {
        // store the distance in kilometers
        double kilometers = 10.8;
        
        // conversion factor
        double conversionFactor = 1.6;
        
        // convert km to miles
        double miles = kilometers / conversionFactor;
        
        // print the result
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}

