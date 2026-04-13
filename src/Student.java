/**
 * @author Aastika Srivastva
 * Student class to store and display student details. 
 */
public class Student {
    protected int rollNo;
    protected String name;
    protected double[] marks;
    
    // Bonus Task: Add student count using static
    public static int studentCount = 0;

    public Student(int rollNo, String name, double[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        studentCount++; // Increment count on object creation
    }

    public void displayDetails() {
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("Marks:");
        if (marks != null) {
            for (int i = 0; i < marks.length; i++) {
                System.out.println(" - Mark " + (i + 1) + ": " + marks[i]);
            }
        }
    }

    // Bonus Task: Calculate average of marks array
    public double calculateAverageMarks() {
        if (marks == null || marks.length == 0) return 0.0;
        double sum = 0.0;
        for (double m : marks) {
            sum += m;
        }
        return sum / marks.length;
    }
}
