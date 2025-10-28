package ders.lesson6;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Baslangic ededi ve hansi araliqda saymag istediyin ededi daxil ele");
        int value = sc.nextInt();
        int diff = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            int result = value + diff * i;
            System.out.println(result);
        }
    }
}
