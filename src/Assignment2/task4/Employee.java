package Assignment2.task4;

public class Employee {
    private String name;
    private int hoursWorked;
    private int id;
    private double bonus;
    private double hourlyWage;

    public Employee(String name, int hoursWorked, int id, double bonus, double hourlyWage) {
        this.name = name;
        setHoursWorked(hoursWorked);
        setId(id);
        setBonus(bonus);
        setHourlyWage(hourlyWage);
    }

    // === Methods ===
    public void calculateMonthlySalary() {
        double monthlySalary = (hourlyWage * hoursWorked) + bonus;
        System.out.println(name + " earned $" + monthlySalary + " for this month.");
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("ID: " + id);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Hourly Wage: $" + hourlyWage);
        calculateMonthlySalary();
    }

    // === Setters ===
    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked >= 0) {
            this.hoursWorked = hoursWorked;
        } else {
            System.out.println("Invalid hours worked");
        }
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Invalid ID");
        }
    }

    public void setBonus(double bonus) {
        if (bonus >= 0) {
            this.bonus = bonus;
        } else {
            System.out.println("Invalid bonus value");
        }
    }

    public void setHourlyWage(double hourlyWage) {
        if (hourlyWage >= 0) {
            this.hourlyWage = hourlyWage;
        } else {
            System.out.println("Invalid hourly wage");
        }
    }
}
