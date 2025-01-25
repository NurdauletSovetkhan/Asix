package Assignment3;

import java.util.*;

public class Subjects {
    private Map<String, List<String>> subjectsMap; // Map to store subjects based on class type
    private String classroomStatus; // Current classroom type

    /* === Constructor === */
    public Subjects() {
        subjectsMap = new HashMap<>();

        // Subjects for technical class direction
        subjectsMap.put("tech", Arrays.asList("Mathematics", "Physics", "Programming", "Engineering"));

        // Subjects for non-technical class direction
        subjectsMap.put("non-tech", Arrays.asList("History", "Literature", "Philosophy", "Sociology"));

        // General subjects common to all classes
        subjectsMap.put("general", Arrays.asList("English", "Physical Education", "Art"));
    }

    /* === Method to get list of subjects based on class direction === */
    public List<String> getSubjects() {
        List<String> subjects = new ArrayList<>();

        // Add subjects based on classroom status
        if (classroomStatus != null && subjectsMap.containsKey(classroomStatus.toLowerCase())) {
            subjects.addAll(subjectsMap.get(classroomStatus.toLowerCase()));
        }

        // Add general subjects for all classes
        subjects.addAll(subjectsMap.getOrDefault("general", Collections.emptyList()));

        return subjects;
    }

    /* === Method to set the classroom status === */
    public void setClassroomStatus(String status) {
        this.classroomStatus = status.toLowerCase(); // Convert status to lowercase for consistency
    }

    public static void main(String[] args) {
        Subjects subjects = new Subjects();

        // Class with technical direction
        subjects.setClassroomStatus("tech");
        System.out.println("Subjects for tech class: " + subjects.getSubjects());

        // Class with non-technical direction
        subjects.setClassroomStatus("non-tech");
        System.out.println("Subjects for non-tech class: " + subjects.getSubjects());

        // Class with unknown direction (general subjects)
        subjects.setClassroomStatus("unknown");
        System.out.println("Subjects for unknown class: " + subjects.getSubjects());
    }
}
