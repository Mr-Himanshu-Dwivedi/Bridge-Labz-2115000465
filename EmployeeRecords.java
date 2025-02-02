class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.printf("Employee ID: %d, Department: %s, Salary: %.2f\n", employeeID, department, salary);
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerDetails() {
        System.out.printf("Manager - Employee ID: %d, Department: %s, Salary: %.2f\n", employeeID, department, getSalary());
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "Sales", 50000.00);
        employee1.displayEmployeeDetails();

        employee1.setSalary(55000.00);
        System.out.println("\nAfter updating salary:");
        employee1.displayEmployeeDetails();

        Manager manager1 = new Manager(201, "HR", 80000.00);
        manager1.displayManagerDetails();
    }
}
