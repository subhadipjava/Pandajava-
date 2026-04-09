// Gross Interface
interface Gross {
    double calculateGrossSalary();
}

// Employee Class
class Employee {
    String name;
    int empId;
    double basicSalary;

    // Constructor
    Employee(String name, int empId, double basicSalary) {
        this.name = name;
        this.empId = empId;
        this.basicSalary = basicSalary;
    }

    // Display employee details
    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

// Salary Class (Multiple Inheritance Concept)
public class Salary extends Employee implements Gross {

    double hra, da;

    // Constructor
    Salary(String name, int empId, double basicSalary) {
        super(name, empId, basicSalary);

        // Calculating allowances
        hra = 0.20 * basicSalary; // 20% HRA
        da = 0.10 * basicSalary;  // 10% DA
    }

    // Implementing Gross interface method
    public double calculateGrossSalary() {
        return basicSalary + hra + da;
    }

    // Display full salary details
    void displaySalary() {
        displayEmployee();
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }

    // Main method
    public static void main(String[] args) {
        Salary emp = new Salary("Rahul", 101, 20000);

        emp.displaySalary();
    }
}