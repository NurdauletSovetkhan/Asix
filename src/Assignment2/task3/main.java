package Assignment2.task3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many students would you like to add?");
        int n = sc.nextInt();
        sc.nextLine();

        Students[] students = new Students[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter student's id: ");
            int id = sc.nextInt();

            System.out.print("Enter student's grades: ");
            int grade = sc.nextInt();
            sc.nextLine();

            students[i] = new Students(name, id, grade);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
        }

        System.out.println("\n=== Students Details ===");
        for (Students student : students) {
            student.display();
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
    }
}
