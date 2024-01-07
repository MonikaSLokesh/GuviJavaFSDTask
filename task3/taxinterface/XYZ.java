package com.task3.taxinterface;

import java.util.Scanner;

public class XYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Employee information
        System.out.println("Enter Employee Information:");
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Employee Salary: $");
        double empSalary = scanner.nextDouble();

        // Employee object
        Employee employee = new Employee(empId, empName, empSalary);

        // Calculate and display income tax
        double incomeTax = employee.calcTax();
        System.out.println("\nIncome Tax for Employee " + empName + ": $" + incomeTax);

        // Product information
        System.out.println("\nEnter Product Information:");
        System.out.print("Product ID: ");
        int productId = scanner.nextInt();
        System.out.print("Product Price: $");
        double productPrice = scanner.nextDouble();
        System.out.print("Product Quantity: ");
        int productQuantity = scanner.nextInt();

        // Product object
        Product product = new Product(productId, productPrice, productQuantity);

        // Calculate and display sales tax
        double salesTax = product.calcTax();
        System.out.println("\nSales Tax for Product " + productId + ": $" + salesTax);

        scanner.close();
    }
}
