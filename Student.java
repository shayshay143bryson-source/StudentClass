import java.util.Objects;

/**
 * A class representing a Student with encapsulated data and comparison logic.
 */
public class Student {
    // Private fields
    private String name;
    private int id;
    private double gpa;

    // Standard Constructor
    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        if (gpa < 0.0) this.gpa = 0.0;
        else if (gpa > 4.0) this.gpa = 4.0;
        else this.gpa = gpa;
    }

    // Copy Constructor
    public Student(Student other) {
        this.name = other.name;
        this.id = other.id;
        this.gpa = other.gpa;
    }

    @Override
    public String toString() {
        return String.format("Student[ID: %-5d | Name: %-10s | GPA: %.2f]", id, name, gpa);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        Student[] classroom = {
            new Student("Ana", 1001, 3.8),
            new Student("Ben", 1002, 3.2),
            new Student("Carlos", 1003, 3.9),
            new Student("Diana", 1004, 2.5),
            new Student("Ethan", 1005, 4.0),
            new Student("Fiona", 1006, 3.1),
            new Student("George", 1007, 2.9),
            new Student("Hannah", 1008, 3.7),
            new Student("Ian", 1009, 2.1),
            new Student("Julia", 1010, 3.5)
        };

        System.out.println("=== OFFICIAL STUDENT ROSTER ===");
        for (Student s : classroom) {
            System.out.println(s);
        }
    }
}
