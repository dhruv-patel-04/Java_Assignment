import java.util.ArrayList;

public class StudentRecordSystem {
    private ArrayList<Student> students = new ArrayList<>();
    private int count = 0;

    // Method to add a new student
    public void addStudent(String studentID, String name, int age, String department) {
        Student student = new Student(studentID, name, age, department);
        students.add(student);
        count++;
        System.out.println("Student added successfully.");
    }

    // Method to display all student records
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records available.");
        } else {
            System.out.println("Student Records:");
            for (Student student : students) {
                System.out.println(student);
                System.out.println();
            }
        }
    }

    // Method to get a student by their ID
    public void getStudent(String studentID) {
        for (Student student : students) {
            if (student.getStudentID().equals(studentID)) {
                student.displayStudentInfo();
                return;
            }
        }
        System.out.println("Student with ID " + studentID + " not found.");
    }

    // Getter for count
    public int getCount() {
        return count;
    }
}
