public class GradingSystem {
    private Student[] students;
    private Grade[] grades;
    private int[] courseCredits;
    private int studentCount;
    private int gradeCount;

    public GradingSystem(int maxStudents, int maxGrades) {
        students = new Student[maxStudents];
        grades = new Grade[maxGrades];
        courseCredits = new int[maxGrades];
        studentCount = 0;
        gradeCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Maximum number of students reached.");
        }
    }

    public void addGrade(Grade grade) {
        if (gradeCount < grades.length) {
            grades[gradeCount] = grade;
            gradeCount++;
        } else {
            System.out.println("Maximum number of grades reached.");
        }
    }

    public void addCourseCredits(int courseID, int credits) {
        if (courseID >= 0 && courseID < courseCredits.length) {
            courseCredits[courseID] = credits;
        } else {
            System.out.println("Invalid course ID.");
        }
    }

    public double calculateGPA(int studentID) {
        double totalPoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < gradeCount; i++) {
            if (grades[i].getStudentID() == studentID) {
                char grade = grades[i].getGrade();
                int points = gradeToPoints(grade);
                int credits = courseCredits[grades[i].getCourseID()];
                totalPoints += points * credits;
                totalCredits += credits;
            }
        }

        if (totalCredits == 0) {
            return 0;
        } else {
            return totalPoints / totalCredits;
        }
    }

    private int gradeToPoints(char grade) {
        switch (grade) {
            case 'A':
                return 10;
            case 'B':
                return 8;
            case 'C':
                return 6;
            case 'D':
                return 4;
            case 'F':
                return 0;
            default:
                return 0;
        }
    }

    public void printGradeReport(int studentID) {
        System.out.println("Grade Report for Student " + studentID + ":");
        for (int i = 0; i < gradeCount; i++) {
            if (grades[i].getStudentID() == studentID) {
                System.out.println("Course " + grades[i].getCourseID() + ": " + grades[i].getGrade());
            }
        }
    }
}