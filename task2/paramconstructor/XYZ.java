package com.task2.paramconstructor;

import java.util.Scanner;

public class XYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Fix the number of products to 5
        int n = 5;

        // Create an array to store Product objects
        Product[] productArr = new Product[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            productArr[i] = new Product(
                    getUserInput("Enter pid: "),
                    getUserInputDouble("Enter price: "),
                    getUserInput("Enter quantity: ")
            );
        }

        // Find Pid of the product with the highest price
        int highestPricePid = findHighestPricePid(productArr);
        System.out.println("Pid of the product with the highest price: " + highestPricePid);

        // Calculate and return the total amount spent on all products
        double totalAmountSpent = calculateTotalAmountSpent(productArr);
        System.out.println("Total amount spent on all products: " + totalAmountSpent);

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    private static int getUserInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    private static double getUserInputDouble(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextDouble();
    }

    private static int findHighestPricePid(Product[] productArr) {
        int highestPricePid = -1;
        double highestPrice = 0;

        for (int i = 0; i < productArr.length; i++) {
            if (productArr[i].price > highestPrice) {
                highestPrice = productArr[i].price;
                highestPricePid = productArr[i].pid;
            }
        }

        return highestPricePid;
    }

    private static double calculateTotalAmountSpent(Product[] productArr) {
        double totalAmountSpent = 0;


        for (Product product : productArr) {
            // Calculate the amount spent for each product
            double amountSpentForProduct = product.price * product.quantity;

            // Add the calculated amount spent to the total
            totalAmountSpent = totalAmountSpent + amountSpentForProduct;
        }

        return totalAmountSpent;
    }

}
