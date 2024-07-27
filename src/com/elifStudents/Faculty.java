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

    public void displayFaculty() {
        System.out.println("Faculty: " + name);
    }

    public void displayDepartmentNames() {
        System.out.println("Departments in Faculty: " + name);
        for (Department department : departments) {
            System.out.println("Department: " + department.getName());
        }
    }
}
