package com.task4.quesFour;

import java.util.HashMap;

public class StudentGradeSystem {
    private HashMap<String, Integer> studentGrades;

    public StudentGradeSystem() {
        this.studentGrades = new HashMap<>();
    }

    // Method to add a new student
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println(name + "'s grade added successfully.");
    }

    // Method to remove a student
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println(name + "'s grade removed successfully.");
        } else {
            System.out.println("Student with name " + name + " not found.");
        }
    }

    // Method to display a student's grade by name
    public void displayGradeByName(String name) {
        if (studentGrades.containsKey(name)) {
            int grade = studentGrades.get(name);
            System.out.println(name + "'s grade is: " + grade);
        } else {
            System.out.println("Student with name " + name + " not found.");
        }
    }

    public static void main(String[] args) {
        StudentGradeSystem gradeSystem = new StudentGradeSystem();

        // Adding students and grades
        gradeSystem.addStudent("Alice", 85);
        gradeSystem.addStudent("Bob", 90);

        // Displaying grades
        gradeSystem.displayGradeByName("Alice");
        gradeSystem.displayGradeByName("Bob");

        // Removing a student
        gradeSystem.removeStudent("Alice");

        // Displaying grades after removal
        gradeSystem.displayGradeByName("Alice");
        gradeSystem.displayGradeByName("Bob");
    }
}
