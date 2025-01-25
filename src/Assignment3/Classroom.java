package Assignment3;

import java.util.List;

public class Classroom {
    private int classroomId;  // IDD
    private String classroomStatus;
    private List<Student> students;  // Students
    private Teacher teacher;  // Bosses of the GYM
    private Subjects subjects;  // Subjects added here

    // Конструктор класса, принимающий classroomType
    public Classroom(int classroomId, List<Student> students, Teacher teacher, String classroomType) {
        this.classroomId = classroomId;
        this.students = students;
        this.teacher = teacher;
        this.classroomStatus = classroomType;

        // Инициализация subjects
        this.subjects = new Subjects();
        this.subjects.setClassroomStatus(classroomType);  // Устанавливаем тип класса для subjects
    }

    public int getClassroomId() {
        return classroomId;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public List<Student> getStudents() {
        return students;
    }

    // Print class Information
    @Override
    public String toString() {
        return "Classroom ID: " + classroomId + "\nTeacher: " + teacher.getName() + "\nStudents: " + students.size();
    }
}
