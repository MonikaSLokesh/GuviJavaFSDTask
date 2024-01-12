package com.task4.quesTwo;
public class Voter {
    private int voterID;
    private String name;
    private int age;

    public Voter(int voterID, String name, int age) throws InvalidAgeException {
        this.voterID = voterID;
        this.name = name;
        setAge(age);
    }

    private void setAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age for voter");
        }
        this.age = age;
    }

    public static void main(String[] args) {
        try {
            Voter voter1 = new Voter(1, "Monika", 25);
            Voter voter2 = new Voter(2, "Lokesh", 25);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
