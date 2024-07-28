package com.elifStudents;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Faculty> faculties;

    public School(String name, int i) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void displayFaculties() {
        System.out.println("Faculties in School: " + name);
        for (Faculty faculty : faculties) {
            faculty.displayFaculty();
        }
    }
}
