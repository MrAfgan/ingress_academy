package ders.lesson6Tasks;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("3 dedi daxil edin");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (b + c == 0) System.out.println("0-a bolme olmaz");
        else {
            System.out.println("(a + b) * c=" + (a + b) * c);
            System.out.println("a / (b + c)=" + (double) a / (b + c));
        }
    }
}

