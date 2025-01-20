package Assignment1;

public class Task4 {
    public static void main(String[] args) {
        double coverPrice = 24.95;
        double discountRate = 0.4; // 40% discount
        double shippingFirstCopy = 3.0;
        double shippingAddCopy = 0.75;
        int numberOfCopies = 60;

        /* The formula is "Discounted Price = CoverPrice × (1 − DiscountRate)"
         Where 1 is 100%, DiscountRate is 40% */
        double discountedPrice = coverPrice * (1 - discountRate);

        // Let's calculate the total book cost
        double totalBookCost = discountedPrice * numberOfCopies;

        // Find the amount of totalShippingCost
        double totalShippingCost = shippingFirstCopy + (shippingAddCopy * (numberOfCopies - 1));

        // Total wholesale cost
        double totalWholesaleCost = totalBookCost + totalShippingCost;
        System.out.printf("Total wholesale cost: %.2f\n", totalWholesaleCost);
        // 1%: The following value will be formatted accordingly
        // .2: Specifies the number of decimal places
        // f: Denotes floating formatting

    }
}
