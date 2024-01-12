package com.task4.quesOne;

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeOutOfRangeException, NameNotValidException {
        this.rollNo = rollNo;
        setName(name);
        setAge(age);
        this.course = course;
    }

    private void setAge(int age) throws AgeOutOfRangeException {
        if (age < 15 || age > 21) {
            throw new AgeOutOfRangeException("Age not within the valid range (15-21)");
        }
        this.age = age;
    }

    private void setName(String name) throws NameNotValidException {
        if (name.matches(".*\\d.*") || !name.matches("[a-zA-Z]+")) {
            throw new NameNotValidException("Name contains numbers or special symbols");
        }
        this.name = name;
    }

    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "Monika ", 20, "Computer Science");
            Student student2 = new Student(2, "Alice123", 19, "Mathematics");
        } catch (AgeOutOfRangeException | NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
