package Tasks;

import java.util.Scanner;

public class Week2ProblemsN12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " - leap year");
        } else {
            System.out.println(year + " - not a leap year");
        }
    }
}
