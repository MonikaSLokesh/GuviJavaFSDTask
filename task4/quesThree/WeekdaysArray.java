package com.task4.quesThree;

import java.util.Scanner;

public class WeekdaysArray {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day position (0-6): ");
        int dayPosition = scanner.nextInt();

        try {
            String dayName = getDayName(weekdays, dayPosition);
            System.out.println("The day at position " + dayPosition + " is: " + dayName);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Day index is outside the valid range (0-6).");
        }
    }

    private static String getDayName(String[] weekdays, int dayPosition) {
        return weekdays[dayPosition];
    }
}
