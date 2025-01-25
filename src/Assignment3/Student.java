package Assignment3;

import java.util.List;

public class Student extends Person {
    private String grade; // Student's grade
    private List<Integer> grades; // Score list
    private String contactInfo; // Contact info!

    public Student(String name, int id, int age, String surname, String grade, List<Integer> grades, String contactInfo) {
        super(name, surname, id, age);
        this.grade = grade;
        this.grades = grades;
        this.contactInfo = contactInfo;
    }

    // Get grade
    public String getGrade() {
        return grade;
    }

    // Average grade!
    public double getAverageGrade() {
        return grades.stream().mapToInt(i -> i).average().orElse(0.0);
    }

    // Passed or not
    public String isStringPassed() {
        if(getAverageGrade() >= 60){
            return "passed";
        } // Passing grade
        else{
            return "failed";
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Grade: " + getAverageGrade() + "\nContact Info: " + contactInfo + "\n";
    }
}
