package Question2;

public class Employee {
    String name;
    double salary;

    public Employee() {
        this.name = "John Doe";
        this.salary = 10;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
