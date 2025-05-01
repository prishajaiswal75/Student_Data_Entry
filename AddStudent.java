package com.example.student_operations;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;


public class AddStudent {

    public static void addStudent(ArrayList<Student> students, Scanner sc) {
        try {
            System.out.print("Enter PRN: ");
            String prn = sc.next();

            for (Student s : students) {
                if (s.getPrn().equals(prn)) {
                    throw new DuplicateStudentException("PRN already exists!");
                }
            }

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter DOB (dd-mm-yyyy): ");
            String dob = sc.next();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Marks should be between 0 and 100.");
            }

            students.add(new Student(prn, name, dob, marks));
            System.out.println("Student added successfully!");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input type! Please enter correct data.");
            sc.next(); // clear scanner buffer
        } catch (DuplicateStudentException | InvalidMarksException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
