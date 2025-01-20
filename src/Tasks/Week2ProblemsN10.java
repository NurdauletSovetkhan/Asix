package Tasks;

public class Week2ProblemsN10 {
    public static void main(String[] args) {
        int number = 153; // Example number
        int original = number;
        int sum = 0;
        int power = 0;

        // The number of digits (power)
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            power++;
        }

        // The Armstrong sum
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;

            // Calculate digit raised to the power manually
            int result = 1;
            for (int i = 0; i < power; i++) {
                result *= digit;
            }

            sum += result; // Add the result to the sum
            temp /= 10;    // Remove the last digit
        }

        // Check the sum equals the original number
        if (sum == original) {
            System.out.println(original + " is an Armstrong Number.");
        } else {
            System.out.println(original + " is not an Armstrong Number.");
        }
    }
}
