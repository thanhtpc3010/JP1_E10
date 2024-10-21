package Manage;

import Entity.Student;
import IStudent.IStudent;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentController implements IStudent {
    private List<Student> students;

    // Constructor
    public StudentController() {
        this.students = new ArrayList<>();
    }

    // Implement input() from IStudent interface
    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter details for new student:");
            Student student = new Student();

            System.out.print("Enter student ID: ");
            student.setId(scanner.nextInt());

            System.out.print("Enter student fullname: ");
            scanner.nextLine(); // Consume newline
            student.setFullname(scanner.nextLine());

            System.out.print("Enter student email: ");
            student.setEmail(scanner.nextLine());

            System.out.print("Enter student mark: ");
            student.setMark(scanner.nextFloat());

            students.add(student);
            System.out.println("Student added successfully!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, please try again.");
            scanner.nextLine(); // Clear buffer
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Implement display() from IStudent interface
    @Override
    public void display() {
        try {
            if (students.isEmpty()) {
                System.out.println("No students to display.");
            } else {
                for (Student student : students) {
                    System.out.println(student.toString());  // toString() called here
                    System.out.println("-------------------");
                }
            }
        } catch (Exception e) {
            System.out.println("Error while displaying students: " + e.getMessage());
        }
    }

    // Method to add multiple students (can be used separately)
    public void addStudent() {
        int addedStudents = 0;
        while (addedStudents < 3) {
            input();
            addedStudents++;
        }
    }

    // Method to sort students by mark
    public void sortStudentsByMark() {
        try {
            students.sort((s1, s2) -> Float.compare(s1.getMark(), s2.getMark()));
            System.out.println("Students sorted by mark.");
        } catch (Exception e) {
            System.out.println("Error while sorting students: " + e.getMessage());
        }
    }
}
