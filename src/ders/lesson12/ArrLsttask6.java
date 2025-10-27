package ders.lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrLsttask6 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Kanan", 15));
        list.add(new Person("Cesur", 11));
        list.add(new Person("Yusif", 14));
        list.add(new Person("Mahammad", 16));
        Collections.sort(list, Comparator.comparing(Person::getName));
        System.out.println(list);
    }
}
