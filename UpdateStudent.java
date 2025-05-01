package com.example.student_operations;
import java.util.*;
public class UpdateStudent {
    public static void update(ArrayList<Student> students, Scanner sc) {
        System.out.print("Enter PRN of student to update: ");
        String prn = sc.next();

        for (Student s : students) {
            if (s.getPrn().equals(prn)) {
                try {
                    System.out.print("Enter new Name: ");
                    s.setName(sc.next());
                    System.out.print("Enter new DOB: ");
                    s.setDob(sc.next());
                    System.out.print("Enter new Marks: ");
                    double marks = sc.nextDouble();

                    // Validate marks range
                    if (marks < 0 || marks > 100) {
                        throw new InvalidMarksException("Marks should be between 0 and 100.");
                    }
                    s.setMarks(marks);
                    System.out.println("Student updated successfully.");
                    return;
                } catch (InvalidMarksException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("Student not found!");
    }
}
