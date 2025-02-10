import java.util.*;

interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;

    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) {
            System.out.println("Salary cannot be negative.");
        } else {
            this.baseSalary = baseSalary;
        }
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.printf("Employee ID: %s\nName: %s\nBase Salary: %.2f\n", employeeId, name, baseSalary);
    }
}

class FullTimeEmployee extends Employee {
    private double annualBonus;

    public FullTimeEmployee(String employeeId, String name, double baseSalary, double annualBonus) {
        super(employeeId, name, baseSalary);
        this.annualBonus = annualBonus;
    }

    public double calculateSalary() {
        return getBaseSalary() + annualBonus;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class ITDepartment implements Department {
    private String departmentName;

    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}

public class Q1_EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Full-Time Employee ID: ");
        String fullTimeEmployeeId = sc.nextLine();
        System.out.print("Enter Full-Time Employee Name: ");
        String fullTimeEmployeeName = sc.nextLine();
        System.out.print("Enter Full-Time Employee Base Salary: ");
        double fullTimeBaseSalary = sc.nextDouble();
        System.out.print("Enter Full-Time Employee Annual Bonus: ");
        double fullTimeAnnualBonus = sc.nextDouble();
        sc.nextLine();  // Consume newline left by nextDouble()

        System.out.print("Enter Part-Time Employee ID: ");
        String partTimeEmployeeId = sc.nextLine();
        System.out.print("Enter Part-Time Employee Name: ");
        String partTimeEmployeeName = sc.nextLine();
        System.out.print("Enter Part-Time Employee Base Salary: ");
        double partTimeBaseSalary = sc.nextDouble();
        System.out.print("Enter Part-Time Employee Hours Worked: ");
        int hoursWorked = sc.nextInt();
        System.out.print("Enter Part-Time Employee Hourly Rate: ");
        double hourlyRate = sc.nextDouble();
        sc.nextLine();  // Consume newline left by nextInt()

        Employee fullTimeEmployee = new FullTimeEmployee(fullTimeEmployeeId, fullTimeEmployeeName, fullTimeBaseSalary, fullTimeAnnualBonus);
        Employee partTimeEmployee = new PartTimeEmployee(partTimeEmployeeId, partTimeEmployeeName, partTimeBaseSalary, hoursWorked, hourlyRate);

        Department itDept = new ITDepartment();
        itDept.assignDepartment("Information Technology");

        List<Employee> employees = new ArrayList<>();
        employees.add(fullTimeEmployee);
        employees.add(partTimeEmployee);

        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.printf("Calculated Salary: %.2f\n", employee.calculateSalary());
            System.out.println(itDept.getDepartmentDetails());
            System.out.println();
        }
    }
}
