/**
 * @author Aastika Srivastva
 * Employee class showing Constructor, this keyword, and static Shared Data.
 */
public class Employee {
    private int empId;
    private String empName;
    private double salary;
    
    // US-06: Shared company name using static variable
    public static String companyName = "Tech Institute";

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void displayEmployeeInfo() {
        System.out.println("Company: " + companyName);
        System.out.println("ID: " + this.empId);
        System.out.println("Name: " + this.empName);
        System.out.println("Salary: $" + this.salary);
    }
}
