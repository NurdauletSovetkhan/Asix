package Assignment3;

import java.util.*;

public class School {
    private String schoolName;
    private String address;
    private List<Student> students; // Student squad
    private List<Teacher> teachers; // Knowledge superheroes
    private List<Course> courses; // Course lists
    private List<Classroom> classrooms; // Classrooms in the school
    private int numberOfStudents; // Total number of students
    private int numberOfTeachers; // Total number of teachers

    /* === Constructor === */
    public School(String schoolName, String address) {
        this.schoolName = schoolName;
        this.address = address;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.classrooms = new ArrayList<>();
    }

    /* === Number of Students === */
    public int getNumberOfStudents() {
        numberOfStudents = students.size();
        return numberOfStudents;
    }

    /* === Number of Teachers === */
    public int getNumberOfTeachers() {
        numberOfTeachers = teachers.size();
        return numberOfTeachers;
    }

    /* === Register Student === */
    public void registerStudent(Student student) {
        students.add(student);
    }

    /* === Hire Teacher === */
    public void hireTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /* === Add a Course === */
    public void addCourse(Course course) {
        courses.add(course);
    }

    /* === Add a Classroom === */
    public void addClassroom(Classroom classroom) {
        classrooms.add(classroom);
    }

    /* === Assign a Teacher to a Classroom === */
    public void assignTeacherToClassroom(Teacher teacher, Classroom classroom) {
        if (teachers.contains(teacher) && classrooms.contains(classroom)) {
            classroom.setTeacher(teacher);
            System.out.println("Teacher " + teacher.getName() + " has been assigned to Classroom ID " + classroom.getClassroomId());
        } else {
            System.out.println("Error: Teacher or Classroom not found in the school!");
        }
    }

    /* === Get All Courses === */
    public List<Course> getCourses() {
        return courses;
    }

    /* === Remove a Student === */
    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    /* === Fire a Teacher === */
    public void removeTeacher(Teacher teacher) {
        this.teachers.remove(teacher);
    }

    /* === Print School Information === */
    public void printSchoolInfo() {
        System.out.println("School: " + schoolName + "\nAddress: " + address);
    }

    /* === Print Students === */
    public List<Student> printStudents() {
        return students;
    }

    /* === Print Teachers === */
    public List<Teacher> printTeachers() {
        return teachers;
    }

    /* === Print Classrooms === */
    public void printClassrooms() {
        for (Classroom classroom : classrooms) {
            System.out.println(classroom);
        }
    }



    /* === Count Passed Students === */
    public void howManyPassed() {
        int passedCount = 0;
        for (Student student : students) {
            if (student.isStringPassed().equals("passed")) {
                passedCount++;
            }
        }
        System.out.println("Number of students who passed: " + passedCount);
    }

    /* === Generate a String Representation of the School === */
    @Override
    public String toString() {
        // Build students info
        StringBuilder studentsInfo = new StringBuilder("Students: ");
        for (Student student : students) {
            studentsInfo.append(student.getName()).append(" ").append(student.getSurname()).append(", ");
        }

        // Build teachers info
        StringBuilder teachersInfo = new StringBuilder("Teachers: ");
        for (Teacher teacher : teachers) {
            teachersInfo.append(teacher.getName()).append(" ").append(teacher.getSurname()).append(", ");
        }

        // Build classrooms info
        StringBuilder classroomsInfo = new StringBuilder("Classrooms: ");
        for (Classroom classroom : classrooms) {
            classroomsInfo.append("ID ").append(classroom.getClassroomId()).append(", ");
        }

        // Clean up commas
        if (studentsInfo.length() > 0) studentsInfo.setLength(studentsInfo.length() - 2);
        if (teachersInfo.length() > 0) teachersInfo.setLength(teachersInfo.length() - 2);
        if (classroomsInfo.length() > 0) classroomsInfo.setLength(classroomsInfo.length() - 2);

        // Format and return string
        return String.format("School: %s, Address: %s\n%s\n%s\n%s",
                schoolName, address, studentsInfo.toString(), teachersInfo.toString(), classroomsInfo.toString());
    }
}
