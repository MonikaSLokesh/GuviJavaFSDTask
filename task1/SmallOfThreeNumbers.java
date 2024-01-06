package com.task1;

import java.util.Scanner;

public class SmallOfThreeNumbers {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number1:");
        int number1 = sc.nextInt();
        System.out.println("Enter a number2:");
        int number2 = sc.nextInt();
        System.out.println("Enter a number3:");
        int number3 = sc.nextInt();

        int smallestNum;

        if ((number1 <= number2) && (number1 <= number3)) {
            smallestNum = number1;
        } else if ((number2 <= number1) && (number2 <= number3)) {
            smallestNum = number2;
        } else {
            smallestNum = number3;
        }

        System.out.println("The smallest among three numbers is " + smallestNum);

        sc.close();
    }
}
