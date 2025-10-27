package ders.lesson12;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrLsttask2 {
    public static void main(String[] args) {
        System.out.println("int arrayina deyisenlerini daxil et");
        Scanner sc = new Scanner(System.in);
        int[] intarr = new int[5];
        for (int i = 0; i < intarr.length; i++) {
            intarr[i] = sc.nextInt();
        }
        System.out.println("Arraylistin olcusunu teyin et");
        int fixedsize = sc.nextInt();
        System.out.println("Arraylistin elementleri daxil et");
        ArrayList<Integer> arrlst = new ArrayList<>();
        for (int i = 0; i < fixedsize; i++) {
            arrlst.add(sc.nextInt());
        }
        System.out.println(intarr.length);
        System.out.println(arrlst.size());
        System.out.println(arrlst);

    }
}
