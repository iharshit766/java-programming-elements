public class CourseFeeCalculator {
    public static void main(String[] args) {
        // store the total course fee
        double fee = 125000;
        
        // store the discount percentage
        double discountPercent = 10;
        
        // calculate the discount amount
        double discount = (discountPercent / 100) * fee;
        
        // calculate the final discounted fee
        double finalFee = fee - discount;
        
        // print the result
        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + finalFee);
    }
}
