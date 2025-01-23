package Assignment3;

import java.util.List;

public class Classroom {
    private int classroomId;  // Уникальный ID для каждого класса
    private List<Student> students;  // Студенты в классе
    private Teacher teacher;  // Преподаватель в классе

    public Classroom(int classroomId, List<Student> students, Teacher teacher) {
        this.classroomId = classroomId;
        this.students = students;
        this.teacher = teacher;
    }

    // Методы для доступа и манипуляции
    public int getClassroomId() {
        return classroomId;
    }

    public List<Student> getStudents() {
        return students;
    }

    // Печать информации о классе
    @Override
    public String toString() {
        return "Classroom ID: " + classroomId + "\nTeacher: " + teacher.getName() + "\nStudents: " + students.size();
    }
}
