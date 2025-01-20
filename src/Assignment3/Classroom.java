package Assignment3;

import java.util.List;

public class Classroom {
    private int classroomID; // Unique classroom ID
    private String classroomName; // Name of the class
    private List<Student> students; // The students in the class
    private Teacher teacher; // The wise teacher!

    public Classroom(int classroomID, String classroomName, Teacher teacher) {
        this.classroomID = classroomID;
        this.classroomName = classroomName;
        this.teacher = teacher;
    }

    // Add student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Remove student
    public void removeStudent(Student student) {
        students.remove(student);
    }

    // Get classroom ID
    public int getClassroomID() {
        return classroomID;
    }

    // Set classroom ID
    public void setClassroomID(int classroomID) {
        this.classroomID = classroomID;
    }

    @Override
    public String toString() {
        return "Class is " + classroomID + ", Teacher is " + teacher.getName();
    }
}
