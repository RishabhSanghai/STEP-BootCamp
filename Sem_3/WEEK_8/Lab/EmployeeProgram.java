abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract double calculateBonus();
}

interface Payable {
    void generatePaySlip();
}

class Manager extends Employee implements Payable {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10;
    }

    @Override
    public void generatePaySlip() {
        System.out.println("Manager Pay Slip:");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Base Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Pay: " + (salary + calculateBonus()));
    }
}

public class EmployeeProgram {
    public static void main(String[] args) {
        Manager manager = new Manager("Rohan", 80000, "Finance");
        manager.generatePaySlip();
    }
}
