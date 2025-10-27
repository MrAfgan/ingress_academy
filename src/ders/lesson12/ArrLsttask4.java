package ders.lesson12;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrLsttask4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Lenovo");
        list.add("Asus");
        list.add("Hp");
        list.add("Acer");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        System.out.println();
        for (String s : list)
            System.out.println(s);
        System.out.println();

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}