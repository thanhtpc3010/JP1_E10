

import Manage.StudentController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentController controller = new StudentController();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Add New Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Sort Students by Mark");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    controller.addStudent();
                    break;
                case 2:
                    controller.display();
                    break;
                case 3:
                    controller.sortStudentsByMark();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}
