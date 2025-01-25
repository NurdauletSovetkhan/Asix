package Assignment3;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        /*=== 1. School Setup ===*/
        School school = new School("AITU", "Almaty, Kazakhstan");
        school.printSchoolInfo();

        /*=== 2. Register Students ===*/
        Student student1 = new Student("Nur", 12, 20, "Sovetkhan", "A", Arrays.asList(90, 99, 99), "123");
        Student student2 = new Student("Aidar", 13, 21, "Alikhan", "B", Arrays.asList(78, 80, 79), "456");

        school.registerStudent(student1);
        school.registerStudent(student2);


        System.out.println("\nList of Students:");
        school.printStudents();

        /*=== 3. Register Teachers ===*/
        Teacher teacher1 = new Teacher("Nurdaulet", 23, "Sovetkhan", Arrays.asList("Math", "Physics"), 10, 1);
        Teacher teacher2 = new Teacher("Zhanar", 30, "Ismailova", Arrays.asList("Biology", "Chemistry"), 8, 2);
        school.hireTeacher(teacher1);
        school.hireTeacher(teacher2);
        System.out.println("\nList of Teachers:");
        school.printTeachers();

        /*=== 4. Create Courses ===*/
        Course course1 = new Course(teacher1, "Math 2406");
        Course course2 = new Course(teacher2, "Biology 2406");
        school.addCourse(course1);
        school.addCourse(course2);

        /*=== 5. Create Classrooms ===*/
        Classroom classroom1 = new Classroom(101, Arrays.asList(student1, student2), teacher1, "humanitarian");
        Classroom classroom2 = new Classroom(102, Arrays.asList(student1), teacher1, "humanitarian");
        Classroom classroom3 = new Classroom(103, Arrays.asList(student2), teacher2, "computer");
        course1.addClassroom(classroom1);
        course1.addClassroom(classroom2);
        course2.addClassroom(classroom3);
        System.out.println("\n" + classroom1.getClassroomId() + " has " + classroom1.getSubjects());
        /*=== 6. List Courses ===*/
        System.out.println("\nList of Courses:");
        for (Course course : school.getCourses()) {
            System.out.println(course);
        }

        /*=== 7. Classroom Details ===*/
        System.out.println("\nClassrooms for each Course:");
        for (Course course : school.getCourses()) {
            for (Classroom classroom : course.getClassrooms()) {
                System.out.println(classroom);
            }
        }

        /*=== 14. Sort everything!!!! ===*/
        System.out.println("\nList of Students sorted by grades:");
        school.filterOfStudents();

        /*=== 8. Check Pass/Fail Status ===*/
        System.out.println("\nChecking if Students Passed:");
        System.out.println(student1.getName() + " Passed: " + student1.isStringPassed());
        System.out.println(student2.getName() + " Passed: " + student2.isStringPassed());
        school.howManyPassed();

        /*=== 9. Show Average Grades ===*/
        System.out.println("\nStudent average grades:");
        System.out.println(student1.getName() + " average: " + student1.getAverageGrade());
        System.out.println(student2.getName() + " average: " + student2.getAverageGrade());

        /*=== 10. Students by Classroom ===*/
        System.out.println("\nAll students in each classroom:");
        for (Course course : school.getCourses()) {
            for (Classroom classroom : course.getClassrooms()) {
                System.out.println("Classroom " + classroom.getClassroomId() + " Students:");
                for (Student s : classroom.getStudents()) {
                    System.out.println(s.getName());
                }
            }
        }

        /*=== 11. Remove Classroom ===*/
        course1.removeClassroom(classroom1);
        System.out.println("\nUpdated list of Courses:");
        for (Course course : school.getCourses()) {
            System.out.println(course);
        }

        /*=== 12. Remove Students and Teachers ===*/
        school.removeStudent(student2);
        school.removeTeacher(teacher2);

        /*=== 13. Show Updated Lists ===*/
        System.out.println("\nUpdated Students List:");
        school.printStudents();
        System.out.println("\nUpdated Teachers List:");
        school.printTeachers();
    }
}
