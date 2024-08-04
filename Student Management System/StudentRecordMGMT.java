import java.util.Scanner;

public class StudentRecordMGMT {
    public static void main(String[] args) {
        StudentRecordSystem srs = new StudentRecordSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Get Student by ID");
            System.out.println("4. View Total Number of Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String studentID = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    srs.addStudent(studentID, name, age, department);
                    break;
                case 2:
                    srs.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Enter Student ID: ");
                    String searchID = scanner.nextLine();
                    srs.getStudent(searchID);
                    break;
                case 4:
                    System.out.println("Total number of students: " + srs.getCount());
                    break;
                case 5:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
    