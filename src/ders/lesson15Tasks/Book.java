package ders.lesson15Tasks;

public class Book  {
    String author;
    int pages;

    public Book(String author, int pages) {
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "("+author  +
                ", pages=" + pages+")";
    }
}
