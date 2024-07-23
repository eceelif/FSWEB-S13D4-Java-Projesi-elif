package com.elifStudents;

public record Student(  String name, String studentNumber, Score score) {


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
    public String toString() {
        return "Name: " + name + ", Student Number: " + studentNumber + ", Score: " + score.getValue();
    }
}
