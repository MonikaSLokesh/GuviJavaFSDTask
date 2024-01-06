package com.task1;

public class ReverseNumber {
    public static void main(String args[]) {
        String number = "876";

        for (int i = number.length() - 1; i >= 0; i--) {
            System.out.print(number.charAt(i));
        }
    }
}
