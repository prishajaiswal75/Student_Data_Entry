package com.example.student_operations;
import java.util.*;
// SearchStudent class to handle different search functionalities
public class SearchStudent {

    // Displays search options and calls the appropriate search method
    public static void searchMenu(ArrayList<Student> students, Scanner sc) {
        System.out.println("1. Search by PRN");
        System.out.println("2. Search by Name");
        System.out.println("3. Search by Position");

        int opt = sc.nextInt();  // Read user input for the menu choice
        switch (opt) {
            case 1:
                searchByPRN(students, sc); // Search by PRN
                break;
            case 2:
                searchByName(students, sc); // Search by Name
                break;
            case 3:
                searchByPosition(students, sc); // Search by Position
                break;
            default:
                System.out.println("Invalid choice!"); // Invalid choice handling
        }
    }

    // Search for a student by PRN
    public static void searchByPRN(ArrayList<Student> students, Scanner sc) {
        System.out.print("Enter PRN: ");
        String prn = sc.next(); // Read PRN from user
        for (Student s : students) {
            if (s.getPrn().equals(prn)) {
                System.out.println(s); // Display student if PRN matches
                return; // Exit the method if student found
            }
        }
        System.out.println("Student not found!"); // Handle case when student is not found
    }

    // Search for a student by Name
    public static void searchByName(ArrayList<Student> students, Scanner sc) {
        System.out.print("Enter Name: ");
        String name = sc.next(); // Read name from user
        boolean found = false; // Flag to track if a student is found

        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println(s); // Display student if name matches
                found = true; // Set found to true if a match is found
            }
        }

        if (!found) {
            System.out.println("No student found with that name."); // If no match is found
        }
    }

    // Search for a student by Position (0-based index)
    public static void searchByPosition(ArrayList<Student> students, Scanner sc) {
        System.out.print("Enter Position (0-based index): ");
        int pos = sc.nextInt(); // Read the position index from user

        try {
            System.out.println(students.get(pos)); // Display student at the given position
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Position out of range."); // Handle case when index is out of range
        }
    }
}
