package com.edu.lesson13.examples;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void printBooksByAuthor(String author) {
        System.out.println("Книги автора " + author + ":");
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book);
            }
        }
    }

    public void printBooksByPublisher(String publisher) {
        System.out.println("Книги издательства " + publisher + ":");
        for (Book book : books) {
            if (book.getPublisher().equalsIgnoreCase(publisher)) {
                System.out.println(book);
            }
        }
    }

    public void printBooksAfterYear(int year) {
        System.out.println("Книги после " + year + " года:");
        for (Book book : books) {
            if (book.getYear() > year) {
                System.out.println(book);
            }
        }
    }
}
