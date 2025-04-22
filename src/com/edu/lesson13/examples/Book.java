package com.edu.lesson13.examples;
public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private double price;
    private String bindingType;

    public Book(int id, String title, String author, String publisher, int year, int pages, double price, String bindingType) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year >= 0 ? year : 0;
        this.pages = pages >= 0 ? pages : 0;
        this.price = price >= 0 ? price : 0;
        this.bindingType = bindingType;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getPublisher() { return publisher; }
    public int getYear() { return year; }
    public int getPages() { return pages; }
    public double getPrice() { return price; }
    public String getBindingType() { return bindingType; }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}