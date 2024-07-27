package com.elifStudents;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Student> students;

    public Department(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public void displayDetails() {
        System.out.println("Department: " + name);
        for (Student student : students) {
            student.displayDetails();
        }
    }
}
