package Assignment1;

public class Task6 {
    public static void main(String[] args) {
        int distance = 350;
        int fuelEfficiency = 25;
        double costPerGallon = 4.1;

        // totalGallons is equal to 14 (14 * 25 = 350)
        int totalGallons = distance / fuelEfficiency;
        System.out.println("Total gallons: " + totalGallons);

        // Product of total and cost gives us wholesale cost
        double totalCost = totalGallons * costPerGallon;
        System.out.printf("Total cost: %.2f\n", totalCost);
        // Print as double, but with 2 number after dot
    }
}
