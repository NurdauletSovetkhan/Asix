package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private Teacher teacher; // Course leader, teacher
    private String courseName; // Name of the course
    private List<Classroom> classrooms; // List of classrooms in this course

    // Constructor to initialize the course
    public Course(Teacher teacher, String courseName) {
        this.teacher = teacher;
        this.courseName = courseName;
        this.classrooms = new ArrayList<>();
    }

    // Getter to retrieve the name of the course
    public String getCourseName() {
        return courseName;
    }

    // Add a classroom to the course
    public void addClassroom(Classroom classroom) {
        boolean add = classrooms.add(classroom);
    }

    // Remove a classroom from the course
    public void removeClassroom(Classroom classroom) {
        classrooms.remove(classroom);
    }

    // Return the list of classrooms in the course
    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    // Retrieve all students from all classrooms in the course
    public List<Student> getAllStudents() {
        List<Student> allStudents = new ArrayList<>();
        for (Classroom classroom : classrooms) {
            allStudents.addAll(classroom.getStudents());
        }
        return allStudents;
    }

    // Provide details about the course
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
