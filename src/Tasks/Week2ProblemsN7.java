package Tasks;

import java.util.Scanner;

public class Week2ProblemsN7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // scan the number
        int o = n; // original value of number
        int r = 0; // variable to contain reverse number

        // == Reverse the Number ==
        while (n != 0) {
            int digit = n % 10;
            r = r * 10 + digit;
            n /= 10;
        }

        // == Compare original with reversed ==
        if (o == r) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
