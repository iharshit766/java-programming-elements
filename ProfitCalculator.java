public class ProfitCalculator {
    public static void main(String[] args) {
        // store cost price and selling price
        int costPrice = 129;
        int sellingPrice = 191;
        
        // calculate profit
        int profit = sellingPrice - costPrice;
        
        // calculate profit percentage
        double profitPercentage = (profit / (double) costPrice) * 100;
        
        // print the result in a single statement
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n"
                + "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
    }
}

