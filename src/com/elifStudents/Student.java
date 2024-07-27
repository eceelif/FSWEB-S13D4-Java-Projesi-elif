package com.elifStudents;

import java.util.List;

public class Student {
    private String name;
    private String studentNumber;
    private Score score;

    public Student(String name, String studentNumber, Score score) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public Score getScore() {
        return score;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Student Number: " + studentNumber + ", Score: " + score.getValue());
    }

    public String toString() {
        return "Name: " + name + ", Student Number: " + studentNumber + ", Score: " + score.getValue();
    }

    public static void listSuccessfulStudents(List<Student> students, int threshold) {
        System.out.println("Successful Students:");
        for (Student student : students) {
            if (student.getScore().getValue() > threshold) {
                student.displayDetails();
            }
        }
    }
}
