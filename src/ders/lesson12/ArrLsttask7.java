package ders.lesson12;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrLsttask7 {
    public static void main(String[] args) {
        ArrayList<Book> booklist=new ArrayList<>();
        booklist.add(new Book("Cingiz Aytmatov", "Deniz kenariyla qachan alabas"));
        booklist.add(new Book("George Oruell","1984"));
        booklist.add(new Book("Xalid Huseyni","Cerpeleng Ucuran"));
        booklist.add(new Book("Herbert George Wells","The War of the Worlds"));
        System.out.println(booklist);
        Iterator<Book> ite= booklist.iterator();
        while (ite.hasNext()){
          Book book=ite.next();
            System.out.println(book);
        }
        for (Book kitab:booklist){
            System.out.println(kitab);
        }
    }
}
