package com.task2;

public class Person {

    String name;
    int age = 18;

    // Constructor to initialize the person object with name and default age
    public Person(String name) {
        this.name = name;
    }

    // Constructor to initialize the person object with name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age of person
    public void display() {
        System.out.println("Name is " + name + " and age is " + age);
    }

    public static void main(String[] args) {
        // Creating a Person object without providing an age
        Person p1 = new Person("Moni");

        // Creating a Person object and initializing it with name and age
        Person p2 = new Person("Monika", 25);

        // Calling the display method to show the details
        p1.display();
        p2.display();
    }
}
