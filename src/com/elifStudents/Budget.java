package com.elifStudents;

public class Budget {
    private double totalBudget;

    public Budget(double totalBudget) {
        this.totalBudget = totalBudget;
    }

    public double getTotalBudget() {
        return totalBudget;
    }

    public double calculateScholarshipAmount(int numberOfStudents) {
        if (numberOfStudents <= 0) {
            return 0;
        }
        return totalBudget / numberOfStudents;
    }

    public void awardScholarship(double amount) {
        totalBudget -= amount;
    }

    public boolean canAwardScholarship(double amount) {
        return totalBudget >= amount;
    }
}
