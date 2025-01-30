package Assignment3;

import java.util.*;

public class main {
    public static void main(String[] args) {
         /* === Creating students === */
        List<Integer> grades1 = Arrays.asList(85, 90, 78);
        Student student1 = new Student("Alice", 1, 16, "Smith", grades1, "alice@mail.com");

        List<Integer> grades2 = Arrays.asList(88, 92, 80);
        Student student2 = new Student("Bob", 2, 17, "Johnson", grades2, "bob@mail.com");

        List<Integer> grades3 = Arrays.asList(70, 75, 68);
        Student student3 = new Student("Charlie", 3, 16, "Williams", grades3, "charlie@mail.com");

        /* === Creating teachers === */
        List<String> teacher1Subjects = Arrays.asList("Math", "Physics");
        Teacher teacher1 = new Teacher("Dr. John", 40, "Doe", teacher1Subjects, 15, 1001);

        List<String> teacher2Subjects = Arrays.asList("Biology", "Chemistry");
        Teacher teacher2 = new Teacher("Ms. Emma", 35, "Brown", teacher2Subjects, 10, 1002);

        /* === Creating classrooms === */
        List<Student> classroom1Students = Arrays.asList(student1, student3);
        Classroom classroom1 = new Classroom(101, classroom1Students, teacher1, "tech");

        List<Student> classroom2Students = Arrays.asList(student2);
        Classroom classroom2 = new Classroom(102, classroom2Students, teacher2, "science");

        /* === Creating courses === */
        Course course1 = new Course(teacher1, "Advanced Math");
        Course course2 = new Course(teacher2, "Chemistry 101");

        /* === Adding classrooms to courses === */
        course1.addClassroom(classroom1);
        course2.addClassroom(classroom2);

        /* === Creating the school === */
        School school = new School("Greenfield High School", "123 Main St");

         /* === Registering students === */
        school.registerStudent(student1);
        school.registerStudent(student2);
        school.registerStudent(student3);

        /* === Hiring teachers === */
        school.hireTeacher(teacher1);
        school.hireTeacher(teacher2);

        /* === Adding courses === */
        school.addCourse(course1);
        school.addCourse(course2);

        /* === Interactive menu === */
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            /* === Menu options === */
            System.out.println("\n=== School Management Menu ===");
            System.out.println("1. View School Info");
            System.out.println("2. Add Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Add Teacher");
            System.out.println("5. Remove Teacher");
            System.out.println("6. Filter Students by Grade");
            System.out.println("7. View All Students");
            System.out.println("8. Sort Students by Average Grade");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println();

            /* === Handling user choice === */
            switch (choice) {
                case 1:
                    // Viewing school information and course classrooms
                    System.out.println(school);
                    System.out.println(course1.getClassrooms());
                    break;

                case 2:
                    // Adding a student
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student surname: ");
                    String surname = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter student contact info: ");
                    String contactInfo = scanner.nextLine();
                    List<Integer> studentGrades = new ArrayList<>();
                    System.out.println("Enter student scores (enter -1 to stop): ");
                    while (true) {
                        int score = scanner.nextInt();
                        if (score == -1) break;
                        studentGrades.add(score);
                    }
                    scanner.nextLine();
                    Student newStudent = new Student(name, id, age, surname, studentGrades, contactInfo);
                    school.registerStudent(newStudent);
                    System.out.println("Student added successfully!");
                    break;

                case 3:
                    // Removing a student
                    System.out.print("Enter student ID to remove: ");
                    int removeId = scanner.nextInt();
                    scanner.nextLine();
                    Student toRemove = null;
                    for (Student student : school.printStudents()) {
                        if (student.getID() == removeId) {
                            toRemove = student;
                            break;
                        }
                    }
                    if (toRemove != null) {
                        school.removeStudent(toRemove);
                        System.out.println("Student removed successfully!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    // Adding a teacher
                    System.out.print("Enter teacher name: ");
                    String teacherName = scanner.nextLine();
                    System.out.print("Enter teacher surname: ");
                    String teacherSurname = scanner.nextLine();
                    System.out.print("Enter teacher age: ");
                    int teacherAge = scanner.nextInt();
                    System.out.print("Enter teacher ID: ");
                    int teacherId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter teacher experience (years): ");
                    int experience = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter teacher subjects (enter 'done' to stop): ");
                    List<String> teacherSubjects = new ArrayList<>();
                    while (true) {
                        String subject = scanner.nextLine();
                        if (subject.equals("done")) break;
                        teacherSubjects.add(subject);
                    }
                    Teacher newTeacher = new Teacher(teacherName, teacherAge, teacherSurname, teacherSubjects, experience, teacherId);
                    school.hireTeacher(newTeacher);
                    System.out.println("Teacher added successfully!");
                    break;

                case 5:
                    // Removing a teacher
                    System.out.print("Enter teacher ID to remove: ");
                    int removeTeacherId = scanner.nextInt();
                    scanner.nextLine();
                    Teacher toRemoveTeacher = null;
                    for (Teacher teacher : school.printTeachers()) {
                        if (teacher.getID() == removeTeacherId) {
                            toRemoveTeacher = teacher;
                            break;
                        }
                    }
                    if (toRemoveTeacher != null) {
                        school.removeTeacher(toRemoveTeacher);
                        System.out.println("Teacher removed successfully!");
                    } else {
                        System.out.println("Teacher not found!");
                    }
                    break;

                case 6:
                    // Filtering students by grade
                    System.out.print("Enter grade to filter by: ");
                    double filterGrade = scanner.nextDouble();
                    System.out.println("Students in grade " + filterGrade + ":");
                    for (Student student : school.printStudents()) {
                        if (student.getAverageGrade()==(filterGrade)) {
                            System.out.println(student);
                        }
                        else {
                            System.out.println("There's no one");
                        }
                    }
                    break;

                case 7:
                    // Viewing all students
                    System.out.println("All Students:");
                    for (Student student : school.printStudents()) {
                        System.out.println(student);
                    }
                    System.out.println("The number of Students is equal to " + school.getNumberOfStudents());
                    break;

                case 8:
                    // Sorting students by average grade
                    System.out.println("Sorting students by average grade...");
                    List<Student> sortedStudents = new ArrayList<>(school.printStudents());
                    sortedStudents.sort(Comparator.comparingDouble(Student::getAverageGrade));
                    for (Student student : sortedStudents) {
                        System.out.println(student);
                    }
                    break;

                case 9:
                    // Exiting the program
                    running = false;
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    // Invalid input handling
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
