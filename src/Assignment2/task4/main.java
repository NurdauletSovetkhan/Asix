package Assignment2.task4;

public class main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alice", 160, 1, 500.00, 25.50);
        Employee employee2 = new Employee("Bob", 180, 2, 600.00, 30.00);
        Employee employee3 = new Employee("Charlie", 140, 3, 450.00, 20.00);

        System.out.println("Employee 1 Details:");
        employee1.display();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.println("Employee 2 Details:");
        employee2.display();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.println("Employee 3 Details:");
        employee3.display();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
}
