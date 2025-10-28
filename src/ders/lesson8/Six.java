package ders.lesson8;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        System.out.println("Uc ededin muqayisesi.");
        System.out.println("---------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ilk ededi?:");
        int first = sc.nextInt();
        System.out.println("Ikinci eded?:");
        int second = sc.nextInt();
        System.out.println("Ucuncu eded?:");
        int third = sc.nextInt();
        if (first > second && first > third) {
            System.out.println(first + " ededi en boyukdur");
        } else if (second > first && second > third) {
            System.out.println(second + " ededi en boyukdur");

        } else if (third > first && third > second) {
            System.out.println(third + " ededi en boyukdur");
        }  else System.out.println("Beraber ededler var");

    }
}

