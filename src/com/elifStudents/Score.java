package com.elifStudents;

public record Score(double value) {

    public Score(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
