package com.elifStudents;

import java.util.ArrayList;
import java.util.List;

public class SuccessfulStudents {
    private List<Student> successfulStudents;

    public SuccessfulStudents() {
        this.successfulStudents = new ArrayList<>();
    }

    public void addSuccessfulStudent(Student student) {
        successfulStudents.add(student);
    }

    public List<Student> getSuccessfulStudents() {
        return successfulStudents;
    }

    public void displaySuccessfulStudents() {
        for (Student student : successfulStudents) {
            System.out.println("Name: " + student.getName());
            System.out.println("Student Number: " + student.getStudentNumber());
            System.out.println("Score: " + student.getScore().getValue());
            System.out.println("Scholarship Awarded: Yes");
            System.out.println("--------");
        }
    }
}
