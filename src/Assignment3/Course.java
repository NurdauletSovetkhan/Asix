package Assignment3;

import java.util.List;

public class Course {
    private Teacher teacher; // GEN SEC
    private String courseName; // Course title
    private List<Student> students; // The learners

    public Course(Teacher teacher, String courseName, List<Student> students) {
        this.teacher = teacher;
        this.courseName = courseName;
        this.students = students;
    }

    // Get course name!
    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "The course name is " + courseName + ". Curator is " + teacher.getName() + " and it has " + students.size() + " students.";
    }

}
