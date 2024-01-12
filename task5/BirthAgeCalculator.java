package com.task5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class BirthAgeCalculator {
    public void calculateAge() {
        Scanner scanner = new Scanner(System.in);

        // user's birthdate
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateInput = scanner.nextLine();

        LocalDate birthdate = LocalDate.parse(birthdateInput);


        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthdate, currentDate);

        System.out.println("Your age is: " + age.getYears() + " years, " +
                age.getMonths() + " months, and " + age.getDays() + " days.");
    }

    public static void main(String[] args) {
        BirthAgeCalculator ageCalculator = new BirthAgeCalculator();

        ageCalculator.calculateAge();
    }
}
