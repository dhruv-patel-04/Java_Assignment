import java.util.ArrayList;
import java.util.List;

public class Enrollment {
    private List<StudentCourse> studentCourses;

    public Enrollment() {
        studentCourses = new ArrayList<>();
    }

    public void enroll(int studentID, int courseID) {
        for (StudentCourse sc : studentCourses) {
            if (sc.getStudentID() == studentID && sc.getCourseID() == courseID) {
                System.out.println("Student " + studentID + " is already enrolled in course " + courseID);
                return;
            }
        }
        studentCourses.add(new StudentCourse(studentID, courseID));
        System.out.println("Student " + studentID + " enrolled in course " + courseID);
    }

    public void drop(int studentID, int courseID) {
        for (int i = 0; i < studentCourses.size(); i++) {
            StudentCourse sc = studentCourses.get(i);
            if (sc.getStudentID() == studentID && sc.getCourseID() == courseID) {
                studentCourses.remove(i);
                System.out.println("Student " + studentID + " dropped course " + courseID);
                return;
            }
        }
        System.out.println("Student " + studentID + " is not enrolled in course " + courseID);
    }

    public void getEnrolledCourses(int studentID, Course[] courseCatalog) {
        boolean found = false;
        System.out.println("Student " + studentID + " is enrolled in the following courses:");
        for (StudentCourse sc : studentCourses) {
            if (sc.getStudentID() == studentID) {
                found = true;
                for (Course course : courseCatalog) {
                    if (course.getCourseID() == sc.getCourseID()) {
                        System.out.println(course);
                    }
                }
            }
        }
        if (!found) {
            System.out.println("Student " + studentID + " is not enrolled in any courses.");
        }
    }
}
