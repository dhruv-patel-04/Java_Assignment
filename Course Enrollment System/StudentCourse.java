public class StudentCourse {
    private int studentID;
    private int courseID;

    public StudentCourse(int studentID, int courseID) {
        this.studentID = studentID;
        this.courseID = courseID;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getCourseID() {
        return courseID;
    }
}