package com.elifStudents;

public class ScholarshipManager {

    private final Budget budget;
    private final SuccessfulStudents successfulStudents;

    public ScholarshipManager(Budget budget) {
        this.budget = budget;
        this.successfulStudents = new SuccessfulStudents();
    }

    public void checkAndAwardScholarships(School school) {
        for (Faculty faculty : school.getFaculties()) {
            for (Department department : faculty.getDepartments()) {
                for (Student student : department.getStudents()) {
                    if (student.getScore().getValue() > 80 && budget.canAwardScholarship()) {
                        budget.awardScholarship();
                        successfulStudents.addSuccessfulStudent(student);
                    }
                }
            }
        }
    }

    public SuccessfulStudents getSuccessfulStudents() {
        return successfulStudents;
    }
}
