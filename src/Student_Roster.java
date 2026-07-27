import java.util.ArrayList;

public class Student_Roster {
    private final ArrayList<Student> students = new ArrayList<>();

    public void add(String studentID, String firstName, String lastName, String email, int age, int grade1, int grade2, int grade3) {
        int[] grades = {grade1, grade2, grade3};
        Student student = new Student(studentID, firstName, lastName, email, age, grades);
        students.add(student);
    }

    public void remove(String studentID) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID().equals(studentID)) {
                students.remove(i);
                System.out.println("Student with ID " + studentID + " has been removed");
                return;
            }
        }
        System.out.println("Error: Student with ID " + studentID + " not found");
    }

    public void print_all() {
            for (Student student : students) {
                student.print();
            }
            System.out.println();
    }

    public void print_average_grade(String studentID) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID().equals(studentID)) {
                double sum = 0;
                double average;
                for (int j = 0; j < students.get(i).getGrades().length; j++) {
                    sum += students.get(i).getGrades()[j];
                }
                average = sum / students.get(i).getGrades().length;
                System.out.println("Student ID:" + students.get(i).getStudentID() + " | Average Grade:" + average);
                return;
            }
        }
    }

    public void print_invalid_emails() {
        for (Student student : students) {
            String emailCheck = student.getEmail();
            if (!emailCheck.contains("@") || !emailCheck.contains(".") ||
                    emailCheck.contains(" ")) {
                System.out.println("Invalid email address: " + emailCheck);
            }
        }
        System.out.println();
    }

}
