package Assignment3;
import java.util.*;

public class School {
    private String schoolName;
    private String address;
    private List<Student> students; // Student squad
    private List<Teacher> teachers; // Knowledge superheroes
    private List<Course> courses; // Course lists

    public School(String schoolName, String address) {
        this.schoolName = schoolName;
        this.address = address;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    // Register student
    public void registerStudent(Student student) {
        students.add(student);
    }

    // Hire teacher
    public void hireTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    // Add a course
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Get all courses
    public List<Course> getCourses() {
        return courses;
    }

    // Remove a student
    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    // Fire a teacher
    public void removeTeacher(Teacher teacher) {
        this.teachers.remove(teacher);
    }

    // Printers
    public void printSchoolInfo() {
        System.out.println("School: " + schoolName + "\nAddress: " + address);
    }

    // Give studeeeents
    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Gimme teacheers
    public void printTeachers() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public void filterOfStudents() {
        students.sort(Comparator.comparing(Student::getGrade));
        students.forEach(student -> System.out.println("Name: " + student.getName() + ", Grade: " + student.getAverageGrade()));
    }

    public void howManyPassed(){
        int passedCount = 0;
        for (Student student : students) {
            if (student.isStringPassed() == "passed") {
                passedCount++;
            }
        }
        System.out.println("Number of students who passed: " + passedCount);
    }

    @Override
    public String toString() {
        // Displaying the students, teachers, and courses
        StringBuilder studentsInfo = new StringBuilder("Students: ");
        for (Student student : students) {
            studentsInfo.append(student.getName()).append(" ").append(student.getSurname()).append(", ");
        }

        StringBuilder teachersInfo = new StringBuilder("Teachers: ");
        for (Teacher teacher : teachers) {
            teachersInfo.append(teacher.getName()).append(" ").append(teacher.getSurname()).append(", ");
        }

        StringBuilder coursesInfo = new StringBuilder("Courses: ");
        for (Course course : courses) {
            coursesInfo.append(course.getCourseName()).append(", ");
        }

        // Clean up commas - We don't want an extra comma at the end!
        if (studentsInfo.length() > 0) {
            studentsInfo.setLength(studentsInfo.length() - 2); // Remove last comma and space
        }
        if (teachersInfo.length() > 0) {
            teachersInfo.setLength(teachersInfo.length() - 2); // Remove last comma and space
        }
        if (coursesInfo.length() > 0) {
            coursesInfo.setLength(coursesInfo.length() - 2); // Remove last comma and space
        }


        // Format the display
        return String.format("School: %s, Address: %s\n%s\n%s\n%s",
                schoolName, address, studentsInfo.toString(), teachersInfo.toString(), coursesInfo.toString());
    }

}
