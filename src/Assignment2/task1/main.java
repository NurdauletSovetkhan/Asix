package Assignment2.task1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = reader.nextLine();
        System.out.print("How old are you? ");
        int age = reader.nextInt();

        System.out.printf("Your name is %s, and your age is %d.%n", name, age);
    }
}