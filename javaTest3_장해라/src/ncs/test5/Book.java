package ncs.test5;

public class Book {

    private String title;
    private String author;
    private int price;
    private String publisher;
    private double discountRate;

    public Book() {
    }

    public Book(String title, String author, int price, String publisher, double discountRate) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.discountRate = discountRate;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPrice() {
        return this.price;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public double getDiscountRate() {
        return this.discountRate;
    }

}
