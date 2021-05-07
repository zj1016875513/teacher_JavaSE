package com.atguigu.morningtest;

public class Book {
    private String name;
    private double price;
    private String author;
    private String factory;

    public Book() {
    }

    public Book(String name, double price, String author, String factory) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.factory = factory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }
}
