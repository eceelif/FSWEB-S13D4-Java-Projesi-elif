package com.elifStudents;

public class Budget {
    private double totalBudget;
    private final double scholarshipAmount;

    public Budget(double totalBudget, double scholarshipAmount) {
        this.totalBudget = totalBudget;
        this.scholarshipAmount = scholarshipAmount;
    }

//    public double getTotalBudget() {
//        return totalBudget;
//    }
//
//    public double getScholarshipAmount() {
//        return scholarshipAmount;
//    }

    public boolean canAwardScholarship() {
        return totalBudget >= scholarshipAmount;
    }

    public void awardScholarship() {
        if (canAwardScholarship()) {
            totalBudget -= scholarshipAmount;
        }
    }
}
