package com.task2.account;

public class Account {
    private double balance;

    // Constructor without arguments
    public Account() {
        this.balance = 0.0;
    }

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + this.balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + this.balance);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    // Method to display the account balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + this.balance);
    }

    // Example Usage
    public static void main(String[] args) {
        // Creating an account with an initial balance of $1000 using the two-argument constructor
        Account account1 = new Account(1000);

        // Performing operations on the account
        account1.displayBalance();  // Displaying initial balance
        account1.deposit(500);      // Depositing $500
        account1.withdraw(200);     // Withdrawing $200
        account1.displayBalance();  // Displaying updated balance
    }
}
