package Assignment1;

public class Task5 {
    public static void main(String[] args) {
        // Start time
        int startMinute = 52;
        int startHour = 6;

        // Segments by seconds
        int easyPace = 15 + (8 * 60);
        int fastPace = 12 + (7 * 60);

        // Calculate total running time
        int totalRunningTime = (2 * easyPace) + (3 * fastPace);

        // Convert start time to seconds
        int startTime = (startHour * 3600) + (startMinute * 60);

        // Calculate end time in seconds
        int endTimeInSeconds = startTime + totalRunningTime;

        // Convert back to hours and minutes
        int endHour = endTimeInSeconds / 3600;
        int endMinute = (endTimeInSeconds % 3600) / 60;

        // Print the result
        System.out.printf("You will get home at: %d:%02d AM\n", endHour, endMinute);
    }
}
