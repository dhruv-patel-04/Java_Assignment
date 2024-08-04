import java.util.Scanner;

public class CourseEnrollment {
    private Course[] courseCatalog;
    private Enrollment enrollment;

    public CourseEnrollment() {
        courseCatalog = new Course[]{
            new Course(1, "COA", 3),
            new Course(2, "JAVA", 4),
            new Course(3, "DSA1", 4)
        };
        enrollment = new Enrollment();
    }

    public static void main(String[] args) {
        CourseEnrollment ce = new CourseEnrollment();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Enroll in a course");
            System.out.println("2. Drop a course");
            System.out.println("3. View enrolled courses");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int studentID = scanner.nextInt();
                    System.out.print("Enter course ID: ");
                    int courseID = scanner.nextInt();
                    ce.enrollment.enroll(studentID, courseID);
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    studentID = scanner.nextInt();
                    System.out.print("Enter course ID: ");
                    courseID = scanner.nextInt();
                    ce.enrollment.drop(studentID, courseID);
                    break;
                case 3:
                    System.out.print("Enter student ID: ");
                    studentID = scanner.nextInt();
                    ce.enrollment.getEnrolledCourses(studentID, ce.courseCatalog);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
