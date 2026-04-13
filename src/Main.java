/**
 * @author Aastika Srivastva
 * Main execution file testing all user stories and concepts.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Student Product Billing & Management System ---");
        System.out.println("Author: Aastika Srivastva\n");
        
        // US-01 & US-03: Create Student, mark array, display
        System.out.println("[US-01 & US-03] Student and Marks Array");
        double[] marks = {85.5, 90.0, 78.5, 88.0, 92.5};
        Student s1 = new Student(101, "Nishika", marks);
        s1.displayDetails();
        
        // Bonus Task: Calculate average of marks array
        System.out.println("Average Marks for " + s1.name + ": " + s1.calculateAverageMarks());
        
        // US-02: String Formatting
        System.out.println("\n[US-02] String Formatting");
        String name = s1.name;
        System.out.println("Original Name : " + name);
        System.out.println("Uppercase     : " + name.toUpperCase());
        System.out.println("Lowercase     : " + name.toLowerCase());
        System.out.println("Length of Name: " + name.length());
        
        // US-08: Inheritance with CollegeStudent
        System.out.println("\n[US-08] College Student (Inheritance)");
        double[] collegeMarks = {75.0, 80.5, 79.0, 88.5, 91.0};
        CollegeStudent cs = new CollegeStudent(102, "Navya", collegeMarks, "Global University");
        cs.displayDetails();
        System.out.println("Average Marks for " + cs.name + ": " + cs.calculateAverageMarks());
        
        // Bonus Task: Add student count using static
        System.out.println("\n[Bonus] Total Students Created (Static Tracking): " + Student.studentCount);

        // US-05 & US-06: Employee constructor and static company variable
        System.out.println("\n[US-05 & US-06] Employee Initialization & Shared Static Data");
        Employee e1 = new Employee(201, "Janhvi", 50000.0);
        Employee e2 = new Employee(202, "Anshika", 55000.0);
        e1.displayEmployeeInfo();
        System.out.println("-");
        e2.displayEmployeeInfo();

        // US-07: Product Encapsulation + Overloaded Constructor
        System.out.println("\n[US-07] Product Encapsulation");
        Product p1 = new Product(); // Zero-arg constructor (Bonus)
        p1.setProductId(1);
        p1.setProductName("Laptop");
        p1.setPrice(1200.0);
        System.out.println("Product 1: " + p1.getProductName() + " - $" + p1.getPrice());
        
        Product p2 = new Product(2, "Mouse", 25.0); // Parameterized constructor
        System.out.println("Product 2: " + p2.getProductName() + " - $" + p2.getPrice());
        
        Product p3 = new Product(3, "Nimisha Special Keyboard", 45.0); // Added one more person from the list
        System.out.println("Product 3: " + p3.getProductName() + " - $" + p3.getPrice());
        
        // US-04: Product Billing details (Method Overloading)
        System.out.println("\n[US-04] Product Billing (Method Overloading)");
        ProductBilling billing = new ProductBilling();
        System.out.println("Bill for 1 product  (" + p1.getProductName() + "): $" + billing.calculateBill(p1));
        System.out.println("Bill for 2 products (" + p1.getProductName() + ", " + p2.getProductName() + "): $" + billing.calculateBill(p1, p2));
        System.out.println("Bill for 3 products: $" + billing.calculateBill(p1, p2, p3));
        
        // Bonus Task: Add discount calculation in billing
        System.out.println("\n[Bonus] Billing with 10% Discount on 2 products (" + p1.getProductName() + ", " + p2.getProductName() + ")");
        System.out.println("Discounted Bill: $" + billing.calculateBillWithDiscount(p1, p2, 10.0));
        
        System.out.println("\nSystem execution completed successfully.");
    }
}
