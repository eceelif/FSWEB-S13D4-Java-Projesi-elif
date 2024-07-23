package com.elifStudents;

import java.util.ArrayList;
import java.util.List;

public class School {
    private final List<Faculty> faculties;

    public School(String name) {
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }
}
