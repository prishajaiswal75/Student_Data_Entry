package com.example.student_operations;
import java.util.*;
public class DeleteStudent {

    // Method to delete a student by PRN
    public static void delete(ArrayList<Student> students, Scanner sc) {
        System.out.print("Enter PRN to delete: ");
        String prn = sc.next();

        // Using an iterator to safely remove elements while iterating
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getPrn().equals(prn)) {
                it.remove(); // Remove the student from the list
                System.out.println("Student deleted.");
                return;
            }
        }

        // Throwing custom exception if the student with given PRN is not found
        throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
    }
}
