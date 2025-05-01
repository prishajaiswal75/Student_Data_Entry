package com.example.student_operations;

public class DuplicateStudentException extends Exception {
  // Constructor to initialize the exception with a message
  public DuplicateStudentException(String message) {
    super(message);  // Call parent constructor with the error message
  }
}
