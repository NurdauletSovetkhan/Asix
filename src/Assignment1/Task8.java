package Assignment1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int studentCount = scanner.nextInt();

        // Arrays for names and scores, subjects
        String[] names = new String[studentCount];
        int[][] scores = new int[studentCount][]; // Двумерный массив для оценки каждого студента по разным предметам.
        String[][] subjects = new String[studentCount][]; // Предметы каждого студента

        System.out.print("How many subjects? ");
        int subCount = scanner.nextInt();


        // Input names and scores
        for (int i = 0; i < studentCount; i++) {
            // Score [i] - is ID of student (e.g. i = 0 is 1 student)
            System.out.print("Enter name of student " + (i + 1) + ": ");
            scanner.nextLine();
            names[i] = scanner.nextLine();

            // Ввод имя -> ввод балла за предмет. Может сделать two dim array?
            // Где j это название предмета, а i это оценка


            // Инициализация массивов под предметы
            subjects[i] = new String[subCount];
            scores[i] = new int[subCount];

            for (int j = 0; j < subCount; j++) {
                System.out.print("Enter subject " + (j + 1) + " for " + names[i] + ": ");
                scanner.nextLine();
                subjects[i][j] = scanner.nextLine();
                // j is a ID of subject
                // [i][j] - [0][0] = Student 0, Subject 0

                System.out.print("Enter score for " + subjects[i][j] + ": ");
                scores[i][j] = scanner.nextInt();

                if(j + 1 == subCount) {
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                }
            }
        }

        // Input the pass score
        System.out.print("Enter passing score: ");
        int passThreshold = scanner.nextInt();

        System.out.println("\nResults:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("\nStudent: " + names[i]);

            int total = 0; // Variable to store the total score for the student
            int maxScore = scores[i][0], minScore = scores[i][0]; // Track the highest and lowest scores
            String topSubject = subjects[i][0], bottomSubject = subjects[i][0]; // Track subjects with max/min scores

            // Process scores for each subject
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j]; // Add score to total

                // Update highest and lowest score information
                if (scores[i][j] > maxScore) {
                    maxScore = scores[i][j];
                    topSubject = subjects[i][j];
                }
                if (scores[i][j] < minScore) {
                    minScore = scores[i][j];
                    bottomSubject = subjects[i][j];
                }

                // Check if the student passed the subject
                String status = scores[i][j] >= passThreshold ? "Pass" : "Fail";
                System.out.println("  " + subjects[i][j] + ": Score = " + scores[i][j] + " (" + status + ")");
            }


            // Calculate and display the average score
            double average = (double) total / scores[i].length;
            System.out.printf("  Average Score: %.1f\n", average);
            System.out.println("  Highest Score: " + maxScore + " (" + topSubject + ")");
            System.out.println("  Lowest Score: " + minScore + " (" + bottomSubject + ")");
        }

        // spicycurry55, 4y ago says:
        // Always clean up your I/O resources when you’re done using them
        scanner.close();
    }
}
