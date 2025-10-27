package ders.lesson12;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrLsttask1 {
    public static void main(String[] args) {
        System.out.println("Arrayliste 5 element doldur");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrlst = new ArrayList<>();
        for (int i = 0; i <=4; i++) {
            arrlst.add(sc.nextInt());
        }
        arrlst.remove(2);
        System.out.println(arrlst.get(1));

    }
}
