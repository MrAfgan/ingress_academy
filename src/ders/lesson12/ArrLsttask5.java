package ders.lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrLsttask5 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Afgan", 38));
        list.add(new Person("Vasif", 44));
        list.add(new Person("Ruslan", 48));
        list.add(new Person("Samir", 53));
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
