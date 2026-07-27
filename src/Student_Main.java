public class Student_Main {
    public static void main(String[] args) {
        String[] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59",
        "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
        "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
        "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
        "5,Christopher,Hogan,chog101@wgu.edu,34,85,89,93"};

        Student_Roster roster1 = new Student_Roster();

        for (int  i = 0; i < students.length; i++) {
            String[] studentData = students[i].split(",");
            String id = studentData[0];
            String firstName = studentData[1];
            String lastName = studentData[2];
            String email = studentData[3];
            int age = Integer.parseInt(studentData[4]);
            int gradeOne = Integer.parseInt(studentData[5]);
            int gradeTwo = Integer.parseInt(studentData[6]);
            int gradeThree = Integer.parseInt(studentData[7]);
            roster1.add(id, firstName, lastName, email, age, gradeOne, gradeTwo, gradeThree);
        }

        roster1.print_all();

        roster1.print_invalid_emails();

        for (int i = 0; i < students.length; i++) {
            String[] studentData = students[i].split(",");
            String id = studentData[0];
            roster1.print_average_grade(id);
        }

        System.out.println();

        roster1.remove("3");

        roster1.remove("3");
    }
}
