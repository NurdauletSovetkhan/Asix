package Assignment1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input the data
        System.out.println("Enter the number of tickets: ");
        int numberTickets = sc.nextInt();

        System.out.println("Enter the type of ticket in lowercase: ");
        String typeOfTicket = sc.next();

        System.out.println("Enter the day of the week as number or lowercase: ");
        String dayOfWeek = sc.next();

        // Switch to type
        int ticketPrice = 0;
        switch (typeOfTicket) {
            case "regular":
                ticketPrice = 10;
                break;
            case "premium":
                ticketPrice = 15;
                break;
            case "vip":
                ticketPrice = 25;
                break;
            default:
                System.out.println("Invalid ticket type.");
                return;
        }

        // Calculate total cost before discount
        int totalCostBeforeDiscount = numberTickets * ticketPrice;

        // Calculate discount if applicable
        double discount = 0;
        if (dayOfWeek.equals("wednesday") || dayOfWeek.equals("3")) {
            discount = totalCostBeforeDiscount * 0.20; // 20% discount
        }

        // Calculate final total cost
        double finalTotalCost = totalCostBeforeDiscount - discount;

        System.out.println("Total cost before discount: $" + totalCostBeforeDiscount);
        System.out.println("Discount amount: $" + discount);
        System.out.println("Final total cost: $" + finalTotalCost);
    }
}
