package Assignment2.task1;

public class Person {
    public String name;
    public int age;

    // === Methods ===
    public String sayHello(){
        return "Hello, my name is " + name + " an I am " + age + " years old";
    }

    // === Constructor ===
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
