package com.task1;

public class PatternPrinting {
    public static void main(String args[]) {
        int rows = 5;
        int cols = 5;

        for (int i = rows; i > 0; i--) {
            for (int j = cols; j >= 1; j--) {
                if (j >= i) {
                    System.out.print(j);
                } else {
                    System.out.print(i);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
