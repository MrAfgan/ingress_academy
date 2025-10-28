package ders.lesson15;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        Map<String, Book> library = new HashMap<>();
        addBook(library, "The Name of the Rose", "Umberto Eco", 512);
        addBook(library, "Cloud Atlas", "David Mitchell", 528);
        addBook(library, "The Witch Elm", "Tana French", 528);
        addBook(library, "Oliver Twist", "Charles Dickens", 391);
        findBook(library, "The Witch Elm");
        listByAuthor(library, "David Mitchell");
        listByAuthor(library, "Afgan");
        System.out.println(library);


    }

    public static void addBook(Map<String, Book> library, String title, String author, int pages) {
        Book book = new Book(author, pages);
        library.put(title, book);
        System.out.println("Book named by: " + title + " successfully added to library");
        System.out.println();
    }

    public static void findBook(Map<String, Book> library, String key) {
        if (library.containsKey(key)) {
            library.get(key);
            System.out.println("Found: " + key + " " + library.get(key));
            System.out.println();

        } else System.out.println("Book not found");
        System.out.println();
    }

    public static void listByAuthor(Map<String, Book> library, String author) {
        boolean found = false;
        for (Map.Entry<String, Book> entry : library.entrySet()) {
            Book book = entry.getValue();
            if (book.author.equals(author)) {
                System.out.println("Author: " + entry.getKey() + book);
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("This author not found in library");
            System.out.println();
        }
    }
}
