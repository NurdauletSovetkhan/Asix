package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private Teacher teacher; // Course leader, teacher
    private String courseName; // Name of the course
    private List<Classroom> classrooms; // List of classrooms in this course

    // Constructor corrected to initialize classrooms as an empty list
    public Course(Teacher teacher, String courseName) {
        this.teacher = teacher;
        this.courseName = courseName;
        this.classrooms = new ArrayList<>(); // Properly initializing the list
    }

    // Getter for course name
    public String getCourseName() {
        return courseName;
    }

    // Method to add a classroom to the course
    public void addClassroom(Classroom classroom) {
        classrooms.add(classroom);
    }

    // Method to remove a classroom from the course
    public void removeClassroom(Classroom classroom) {
        classrooms.remove(classroom);
    }

    // Return classrooms in the course (as a list)
    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    // Retrieve all students across all classrooms in this course
    public List<Student> getAllStudents() {
        List<Student> allStudents = new ArrayList<>();
        for (Classroom classroom : classrooms) {
            allStudents.addAll(classroom.getStudents());
        }
        return allStudents;
    }

    @Override
    public String toString() {
        StringBuilder courseDetails = new StringBuilder();
        courseDetails.append("Course: ").append(courseName)
                .append("\nTeacher: ").append(teacher.getName())
                .append("\nNumber of Classrooms: ").append(classrooms.size())
                .append("\nNumber of Students: ").append(getAllStudents().size());
        return courseDetails.toString();
    }
}
