import java.util.Arrays; // to convert array of grades to readable text

public class Student {
    private String studentID;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int[] grades;

    public Student(String studentID, String firstName, String lastName, String email, int age, int[] grades) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.grades = grades;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getGrades() {
        return grades; // currently the grades array may be accessed by means other than setGrades further research needed
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void print() {
        System.out.println("Student ID: " + getStudentID());
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Age: " + getAge());
        System.out.println("Grades: " + Arrays.toString(getGrades()));
    }

}
