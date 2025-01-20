package Tasks;

public class Week2ProblemsN9 {
    public static void main(String[] args) {
        int a = 56, b = 98; // example numbers

        // using the Euclidean algorithm
        while (b != 0) {
            int temp = b; // temporarily store for the value of b
            b = a % b;    // update b to be the remainder of a divided by b
            a = temp;     // update a to be the previous value of b
        }

        // when b becomes 0, a holds the GCD
        System.out.println("GCD is " + a);
    }
}
