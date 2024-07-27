package com.elifStudents;

import java.util.ArrayList;
import java.util.List;

public class ScholarshipManager {
    private Budget budget;
    private List<Student> successfulStudents;

    public ScholarshipManager(Budget budget) {
        this.budget = budget;
        this.successfulStudents = new ArrayList<>();
    }

    public void checkAndAwardScholarships(School school) {
        for (Faculty faculty : school.getFaculties()) {
            for (Department department : faculty.getDepartments()) {
                for (Student student : department.getStudents()) {
                    if (student.getScore().getValue() > 80) {
                        successfulStudents.add(student);
                    }
                }
            }
        }

        double scholarshipAmount = budget.calculateScholarshipAmount(successfulStudents.size());
        for (Student student : successfulStudents) {
            if (budget.canAwardScholarship(scholarshipAmount)) {
                budget.awardScholarship(scholarshipAmount);
                System.out.println("Scholarship awarded to " + student.getName() + ": " + scholarshipAmount + " TL");
            } else {
                System.out.println("Insufficient budget for " + student.getName());
            }
        }
    }

    public List<Student> getSuccessfulStudents() {
        return successfulStudents;
    }
}
