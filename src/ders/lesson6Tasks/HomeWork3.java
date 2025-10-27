package ders.lesson6Tasks;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("3 eded?");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a < c) System.out.println("1ci reqem 2ci ve 3cu reqemin araliginda yerlesir");
        else if (a > b && a > c) {
            System.out.println("1ci reqem diger reqemlerden boyukdur");
        } else if (a<b && a<c) {
            System.out.println("1ci reqem diger reqemlerden kicikdir");

        }else System.out.println("1ci reqem 3cu ve 2ci reqemin araliginda yerlesir");
    }
}
