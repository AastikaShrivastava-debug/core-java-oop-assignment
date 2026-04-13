/**
 * @author Aastika Srivastva
 * CollegeStudent class demonstrating inheritance from Student.
 */
public class CollegeStudent extends Student {
    private String collegeName;

    public CollegeStudent(int rollNo, String name, double[] marks, String collegeName) {
        super(rollNo, name, marks);
        this.collegeName = collegeName;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("College Name: " + this.collegeName);
    }
}
