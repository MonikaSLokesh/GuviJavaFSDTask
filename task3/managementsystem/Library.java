package com.task3.managementsystem;

class Library {
    private Book[] books;

    public Library(int capacity) {
        books = new Book[capacity];
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println("Book added to the library!");
                return;
            }
        }
        System.out.println("Cannot add more books. Library is full.");
    }

    public void removeBook(int bookID) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].bookID == bookID) {
                books[i] = null;
                System.out.println("Book removed from the library!");
                return;
            }
        }
        System.out.println("Book not found in the library. Cannot remove.");
    }

    public Book searchBook(int bookID) {
        for (Book book : books) {
            if (book != null && book.bookID == bookID) {
                return book;
            }
        }
        return null;
    }

    public void displayBooks() {
        System.out.println("Books in the Library:");
        for (Book book : books) {
            if (book != null) {
                System.out.println("Book ID: " + book.bookID + ", Title: " + book.title +
                        ", Author: " + book.author + ", Available: " + book.isAvailable);
            }
        }
    }
}
