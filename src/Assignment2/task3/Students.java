package Assignment2.task3;

public class Students {
    private String name;
    private int id;
    private int grades;

    // === Constructor ===
    public Students(String name, int id, int grades) {
        this.name = name;
        setId(id);
        setGrades(grades);
    }

    // === Getters ===
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getGrades() {
        return grades;
    }

    // === Setters ===
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid ID");
        }
        this.id = id;
    }
    public void setGrades(int grades) {
        if (grades < 0 || grades > 100) {
            throw new IllegalArgumentException("Invalid grades");
        }
        this.grades = grades;
    }

    // === Display the info ===
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grades);
    }
}
