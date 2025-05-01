# Student_Data_Entry
# Student Management System

This is a Java-based modular application that allows users to manage student records. It provides functionality to add, update, delete, search, and display student information, while demonstrating the use of object-oriented programming and custom exception handling.

Project Structure:

The main package is:
com.example.student_operations

It contains the following files:

AddStudent.java

DeleteStudent.java

DisplayStudents.java

DuplicateStudentException.java

InvalidMarksException.java

module-info.java

SearchStudent.java

Student.java

StudentMain.java

StudentNotFoundException.java

UpdateStudent.java

Features:

Add new student details (name, PRN, DOB, marks).

Update existing student records.

Delete a student using PRN.

Search for a student.

Display all student records.

Use of custom exceptions:

DuplicateStudentException – for duplicate PRNs.

InvalidMarksException – when marks are not between 0 and 100.

StudentNotFoundException – when the student doesn't exist.

Java Modules:

The module-info.java file defines the module as:
module student.operations {
    exports com.example.student_operations;
}

All Java files must begin with the line:
package com.example.student_operations;
