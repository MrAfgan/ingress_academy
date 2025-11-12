package ders.lesson12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrLsttask6 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Kanan", 15));
        list.add(new Person("Cesur", 11));
        list.add(new Person("Yusif", 14));
        list.add(new Person("Mahammad", 16));
        list.sort(Comparator.comparing(Person::getName));
        System.out.println(list);
    }
}
