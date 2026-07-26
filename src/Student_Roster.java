import java.util.ArrayList;

public class Student_Roster {
    private ArrayList<Student> students = new ArrayList<>();

    public void add(String studentID, String firstName, String lastName, String email, int age, int grade1, int grade2, int grade3) {
        int[] grades = {grade1, grade2, grade3};
        Student student = new Student(studentID, firstName, lastName, email, age, grades);
        students.add(student);
    }

    public void remove(String studentID) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID().equals(studentID)) {
                students.remove(i);
                return;
            }
        }
        System.out.println("Student with ID " + studentID + " not found");
    }
}
