package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private Teacher teacher; // Course leader, teacher
    private String courseName; // Name of the course
    private List<Classroom> classrooms; // List of classrooms in this course

    // Constructor
    public Course(Teacher teacher, String courseName) {
        this.teacher = teacher;
        this.courseName = courseName;
        this.classrooms = new ArrayList<>();
    }

    // Getter
    public String getCourseName() {
        return courseName;
    }
    // Add & Remove
    public void addClassroom(Classroom classroom) {
        classrooms.add(classroom);
    }

    public void removeClassroom(Classroom classroom) {
        classrooms.remove(classroom);
    }

    // Return classrooms in the course
    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    // Retrieve all studs
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
