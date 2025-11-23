package chapter4and5practice;

public class Book {
    String title;
    double price;

    public Book() {
        this("1984", 7.0);
    }

    public Book(String title) {
        this(title, 7.0);
    }

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }
}
