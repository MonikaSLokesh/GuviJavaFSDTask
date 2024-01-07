package com.task3.managementsystem;

import java.util.Scanner;

public class LibrarySystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library library = new Library(5);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addBook(scanner, library);
                    break;
                case 2:
                    removeBook(scanner, library);
                    break;
                case 3:
                    searchBook(scanner, library);
                    break;
                case 4:
                    library.displayBooks();
                    break;
                case 5:
                    System.out.println("Exiting the Library Management System.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void addBook(Scanner scanner, Library library) {
        System.out.println("Enter book details:");

        System.out.print("Book ID: ");
        int bookID = scanner.nextInt();

        System.out.print("Title: ");
        String title = scanner.next();

        System.out.print("Author: ");
        String author = scanner.next();

        System.out.print("Is Available (true/false): ");
        boolean isAvailable = scanner.nextBoolean();

        Book newBook = new Book(bookID, title, author, isAvailable);
        library.addBook(newBook);

        System.out.println("Book added successfully!");
    }

    private static void removeBook(Scanner scanner, Library library) {
        System.out.print("Enter the Book ID to remove: ");
        int bookID = scanner.nextInt();

        library.removeBook(bookID);
    }

    private static void searchBook(Scanner scanner, Library library) {
        System.out.print("Enter the Book ID to search: ");
        int bookID = scanner.nextInt();

        Book foundBook = library.searchBook(bookID);
        if (foundBook != null) {
            System.out.println("Book found:");
            System.out.println("Book ID: " + foundBook.bookID + ", Title: " + foundBook.title +
                    ", Author: " + foundBook.author + ", Available: " + foundBook.isAvailable);
        } else {
            System.out.println("Book not found in the library.");
        }
    }
}


