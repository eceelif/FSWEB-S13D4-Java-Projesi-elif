package models;

import com.students.ICourse;

public class Course implements ICourse {
    private String courseName;
    private int credits;

    public Course(String courseName, int credits) {
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public String toString() {
        return "Course Name: " + courseName + ", Credits: " + credits;
    }
}
