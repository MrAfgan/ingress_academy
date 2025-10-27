package ders.lesson12;

import java.util.ArrayList;

public class ArrLsttask3 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Afgan");
        list.add("OCA");
        list.add("Student");
        System.out.println(list.contains("elnur"));
        System.out.println(list.indexOf("OCA"));
        System.out.println(list.isEmpty());
        System.out.println(list.set(1,"Java"));
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
    }
}
