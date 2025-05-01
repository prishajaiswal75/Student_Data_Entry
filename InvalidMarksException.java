package com.example.student_operations;

// InvalidMarksException.java
public class InvalidMarksException extends Exception {
    // Constructor to initialize the exception with a message
    public InvalidMarksException(String message) {
        super(message);  // Call parent constructor with the error message
    }
}
