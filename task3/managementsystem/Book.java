package com.task3.managementsystem;

class Book {
    int bookID;
    String title;
    String author;
    boolean isAvailable;

    public Book(int bookID, String title, String author, boolean isAvailable) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
}