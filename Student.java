package com.example.student_operations;

class Student {
    private final String prn;
    private String name;
    private String dob;
    private double marks;

    // Constructor to initialize the student data
    public Student(String prn, String name, String dob, double marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    // Getter methods
    public String getPrn() {
        return prn;
    }

    public String getName() {
        return name;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "PRN: " + prn + ", Name: " + name + ", DOB: " + dob + ", Marks: " + marks;
    }
}
