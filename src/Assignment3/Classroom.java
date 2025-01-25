package Assignment3;

import java.util.List;

public class Classroom {
    private int classroomId;            // ID of the classroom
    private String classroomStatus;     // Type of classroom (e.g., tech or non-tech)
    private List<Student> students;     // Students in the classroom
    private Teacher teacher;            // Teacher assigned to the classroom
    private Subjects subjects;          // Subjects linked to this classroom

    // Конструктор класса
    public Classroom(int classroomId, List<Student> students, Teacher teacher, String classroomStatus) {
        this.classroomId = classroomId;
        this.students = students;
        this.teacher = teacher;
        this.classroomStatus = classroomStatus;

        // Initialize subjects
        this.subjects = new Subjects();
        this.subjects.setClassroomStatus(classroomStatus);  // Set classroom type in subjects
    }

    // Getters
    public int getClassroomId() {
        return classroomId;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getClassroomStatus() {
        return classroomStatus;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    // Setters
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    // Print class information
    @Override
    public String toString() {
        StringBuilder studentsInfo = new StringBuilder("Students: ");
        for (Student student : students) {
            studentsInfo.append(student.getName()).append(", ");
        }
        if (studentsInfo.length() > 0) {
            studentsInfo.setLength(studentsInfo.length() - 2);  // Remove last comma
        }

        return String.format(
                "Classroom ID: %d\nType: %s\nTeacher: %s\n%s",
                classroomId,
                classroomStatus,
                teacher != null ? teacher.getName() : "No teacher assigned",
                studentsInfo.toString()
        );
    }
}
