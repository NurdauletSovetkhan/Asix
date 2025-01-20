package Assignment1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int request = sc.nextInt(); // Variable where int is stored
        if(request % 2 == 0){ // Check is it even
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }
}
