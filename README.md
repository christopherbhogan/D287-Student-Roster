# Student Roster Management

A lightweight Java application for managing a single course roster. The program stores five students and demonstrates basic object-oriented programming concepts, including encapsulation, information hiding, abstraction, and class responsibility.

## Features

- Stores student ID, first name, last name, email address, age, and three grades.
- Adds students to an `ArrayList<Student>`.
- Prints all student records in a tab-separated format.
- Identifies and displays invalid email addresses.
- Calculates and prints each student’s average grade.
- Removes a student by ID and displays an error when an ID is not found.

## Project Structure

- `Student_Main.java`  
  Contains the initial student data and runs the required program scenario.

- `Student.java`  
  Represents one student and contains private fields, getters, setters, a constructor, and a print method.

- `Student_Roster.java`  
  Manages the `ArrayList<Student>` and provides roster operations such as adding, removing, printing, validating emails, and calculating averages.

## How to Run

1. Open the project in IntelliJ IDEA.
2. Run `Student_Main.java`.
3. Review the console output for the roster, invalid email addresses, grade averages, and student-removal results.

## Object-Oriented Design

The application uses encapsulation and information hiding by declaring student data and the roster list as private. Public methods provide controlled access to student and roster operations. Responsibilities are separated among `Student`, `Student_Roster`, and `Student_Main`.
