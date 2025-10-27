package ders.lesson12;

import java.util.*;

public class ArrLsttask8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("1den 10a dek random ve tekrarlanan ededler daxil ele:");
        for (int i = 0; i < 10; i++) {
            int numb = sc.nextInt();
            if (numb <= 0 || numb > 10) {
                System.out.println("sifir,menfi ve yaxud 10dan boyuk eded daxil edildi");
                i--;
                continue;
            }
            list.add(numb);
        }
        System.out.println("Unsortedlist "+list);
        TreeSet<Integer> sortset = new TreeSet<>(list);
        ArrayList<Integer> newlist = new ArrayList<>(sortset);
        System.out.println("Sortedliste "+newlist);

    }
}
