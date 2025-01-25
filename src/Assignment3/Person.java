package Assignment3;

public class Person {
    // Base class
    // Nevermind this row
    private String name;
    private String surname;
    private int age;
    private int id;


    public Person(String name, String surname, int age, int id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "The name is " + name + "\nThe surname is " + surname +
                "\nThe age is " + age + "\nThe ID is " + id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getID(){
        return id;
    }
}
