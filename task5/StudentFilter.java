package com.task5;

import java.util.List;
import java.util.stream.Collectors;

public class StudentFilter {
    public List<String> filterStudentsWithA(List<String> studentNames) {
        return studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        StudentFilter studentFilter = new StudentFilter();

        // Example usage:
        List<String> allStudents = List.of("Alice", "Bob", "Anna", "Alex", "Charlie", "David", "Ava", "Daniel", "Grace", "Andrew");
        List<String> studentsWithA = studentFilter.filterStudentsWithA(allStudents);

        // Print the result
        System.out.println("All students: " + allStudents);
        System.out.println("Students whose names start with 'A': " + studentsWithA);
    }
}
