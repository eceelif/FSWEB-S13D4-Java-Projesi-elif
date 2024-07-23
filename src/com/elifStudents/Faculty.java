package com.elifStudents;


import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<Department> departments;

    public Faculty(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }
    public void displayDepartmentNames() {
                System.out.println("Departments in Faculty elif: " + name);
                for (Department department : departments) {
                    System.out.println("Department elif: " + department);
                }
            }
    public void displayFaculty() {
        System.out.println("Faculty name: " + name);
        for (Department department : departments) {
            System.out.println("Department: " + department);
            for (Student student : department.getStudents()) {
                System.out.println("Studet: " + student.getName() + " student number: " + student.getStudentNumber() + student.getScore().getValue());
            }
        }
    }
        }


