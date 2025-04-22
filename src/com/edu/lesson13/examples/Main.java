package com.edu.lesson13.examples;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book(1, "Java Programming", "John Doe", "TechBooks", 2015, 300, 29.99, "Hardcover"));
        library.addBook(new Book(2, "Effective Java", "Joshua Bloch", "TechBooks", 2018, 400, 39.99, "Paperback"));
        library.addBook(new Book(3, "Clean Code", "Robert C. Martin", "Coding Press", 2009, 450, 49.99, "Hardcover"));

        library.printBooksByAuthor("Joshua Bloch");
        library.printBooksByPublisher("TechBooks");
        library.printBooksAfterYear(2010);
    }
}