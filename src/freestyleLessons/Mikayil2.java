package freestyleLessons;

import java.util.Scanner;

public class Mikayil2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1?");
        int a = sc.nextInt();
        System.out.println("2?");
        int b = sc.nextInt();
        System.out.println("3?");
        int c = sc.nextInt();
         if (a > b && a > c) {
            System.out.println(a + "Boyukdur");

        } else if (b > a && b > c) {
            System.out.println(b + (b + "boyukdur"));

        } else if (c > a && c > b) {
            System.out.println(c + "boyukdur");

        } else System.out.println("Beraber eded var");
    }
}
