package week1.keyboard_input;

import java.util.Scanner;

public class MoreUserInputOfData {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter the following information so I can sell it for a profit!");
        System.out.println("");

        System.out.print("First name: ");

        String firstName = reader.nextLine();

        System.out.print("Last name: ");

        String lastName = reader.nextLine();

        System.out.print("Grade (9-12): ");

        int grade = reader.nextInt();
        reader.nextLine();

        System.out.print("Student ID: ");

        int studentId = reader.nextInt();
        reader.nextLine();

        System.out.print("Login: ");

        String username = reader.nextLine();

        System.out.print("GPA (0.0-4.0): ");

        double gpa = reader.nextDouble();
        reader.nextLine();

        System.out.println("");
        System.out.println("Your information:");
        System.out.println(String.format("    Login: %s", username));
        System.out.println(String.format("    ID: %d", studentId));
        System.out.println(String.format("    Name: %s, %s", lastName, firstName));
        System.out.println(String.format("    GPA: %.2f", gpa));
        System.out.println(String.format("    Grade: %d", grade));

        reader.close();
    }
}
