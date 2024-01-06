package com.task2.superkeyword;

public class Employee extends Person {

    String empID;
    double salary;

    public Employee(String name, int age, String empID, double salary) {
        super(name, age);

        this.empID = empID;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Person personObj = new Person("Lokesh", 25);
        System.out.println("Person - Name: " + personObj.name + ", Age: " + personObj.age);

        Employee employeeObj = new Employee("Monika", 28, "E123", 50000);
        System.out.println("Employee - Name: " + employeeObj.name + ", Age: " + employeeObj.age +
                ", Employee ID: " + employeeObj.empID + ", Salary: " + employeeObj.salary);
    }
}
