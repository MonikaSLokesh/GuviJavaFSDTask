package com.task1;

import java.util.Scanner;

public class NumberNegativeOrPositive {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        if (number < 0)
            System.out.println("The number " + number + " is NEGATIVE");
        else
            System.out.println("The number " + number + " is POSITIVE");

        sc.close();
    }
}
