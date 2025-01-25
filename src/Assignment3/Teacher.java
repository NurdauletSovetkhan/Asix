package Assignment3;

import java.util.List;

public class Teacher extends Person {
    private List<String> subjects;
    private double salary;
    private int experience; // Teacher years!

    /* === Constructor === */
    public Teacher(String name, int age, String surname, List<String> subjects, int experience, int id) {
        super(name, surname, age, id);
        this.subjects = subjects;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSubject: " + subjects + "\nExperience: " + experience +
                " years with $" + salary + " for a month\n";
    }

}
