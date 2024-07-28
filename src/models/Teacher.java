package models;

import com.students.ITeacher;

public class Teacher implements ITeacher {
    private String name;
    private String courseName;
    private int hours;
    private String classroom;

    public Teacher(String name, String courseName, int hours, String classroom) {
        this.name = name;
        this.courseName = courseName;
        this.hours = hours;
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getHours() {
        return hours;
    }

    public String getClassroom() {
        return classroom;
    }

    public String toString() {
        return "Teacher Name: " + name + ", Course: " + courseName + ", Hours: " + hours + ", Classroom: " + classroom;
    }
}
