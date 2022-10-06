package com.sh.io.test4.model.vo;

import java.time.LocalDate;

public class Book {

    private String title;
    private String author;
    private int price;
    private LocalDate dates;

    public Book() {
    }

    public Book(String title, String author, int price, LocalDate dates) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.dates = dates;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getDates() {
        return this.dates;
    }

    public void setDates(LocalDate dates) {
        this.dates = dates;
    }

    @Override
    public String toString() {
        return "{" +
                " title='" + getTitle() + "'" +
                ", author='" + getAuthor() + "'" +
                ", price='" + getPrice() + "'" +
                ", dates='" + getDates() + "'" +
                "}";
    }

}
