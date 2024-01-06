package com.task1;

import java.util.Scanner;

public class PercentageDiscount {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the purchase amount:");
        double purchaseAmount = sc.nextFloat();
        double discountAmount =0;
        double finalPayableAmount;

        if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            // 10% discount
            discountAmount = (10.0 / 100.0) * purchaseAmount;
        } else if (purchaseAmount > 1000) {
            // 20% discount
            discountAmount = (20.0 / 100.0) * purchaseAmount;
        } else {
            // No discount
            System.out.println("No Discount applied");
        }

        // Calculate final total after discount
        finalPayableAmount = purchaseAmount - discountAmount;

        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Total after Discount: " + finalPayableAmount);

        sc.close();
    }
}
