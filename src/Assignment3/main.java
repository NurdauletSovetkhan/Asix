package Assignment3;

import java.util.*;

public class main {
    public static void main(String[] args) {
        // School time
        School school = new School("AITU", "Almaty, Kazakhstan");

        // Students incoming
        Student student1 = new Student("Nur", 12, 20, "Sovetkhan", "A", Arrays.asList(90, 85, 88), "123");
        Student student2 = new Student("Aidar", 13, 21, "Alikhan", "B", Arrays.asList(78, 80, 79), "456");

        // Register them
        school.registerStudent(student1);
        school.registerStudent(student2);

        // Teacher power
        Teacher teacher1 = new Teacher("Nurdaulet", 23, "Sovetkhan", Arrays.asList("Math", "Physics"), 10, 1);
        Teacher teacher2 = new Teacher("Zhanar", 30, "Ismailova", Arrays.asList("Biology", "Chemistry"), 8, 2);

        // Hire them
        school.hireTeacher(teacher1);
        school.hireTeacher(teacher2);

        // Course setup
        Course course1 = new Course(teacher1, "Math 101", Arrays.asList(student1, student2));
        Course course2 = new Course(teacher2, "Biology 101", Arrays.asList(student1));

        // Add courses
        school.addCourse(course1);
        school.addCourse(course2);

        // Show school
        System.out.println("School Information: ");
        System.out.println(school);

        // Students list
        System.out.println("\nList of Students: ");
        school.printStudents();

        // Teachers list
        System.out.println("\nList of Teachers: ");
        school.printTeachers();

        // Remove
        school.removeStudent(student2);
        school.removeTeacher(teacher2);

        // Updated lists
        System.out.println("\nUpdated List of Students: ");
        school.printStudents();

        System.out.println("\nUpdated List of Teachers: ");
        school.printTeachers();

        // Deadline is 60%
        // How many passed?
        school.howManyPassed();
    }
}
