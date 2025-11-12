package chapter3;

import java.util.Scanner;

public class ArrayForMiddleLong {
    public static void main(String[] args) {
        System.out.println("5 eded daxil edin:");
        Scanner sc = new Scanner(System.in);
        System.out.println("ilk eded?");
        int num1 = sc.nextInt();
        System.out.println("ikinci eded?");
        int num2 = sc.nextInt();
        System.out.println("Ucuncu eded?");
        int num3 = sc.nextInt();
        System.out.println("Dorduncu eded?");
        int num4 = sc.nextInt();
        System.out.println("Besinci eded?");
        int num5 = sc.nextInt();
        int[] nom = new int[5];
        nom[0] = num1;
        nom[1] = num2;
        nom[2] = num3;
        nom[3] = num4;
        nom[4] = num5;
        System.out.println("Ededlein cemi:");
        System.out.println(nom[0] + nom[1] + nom[2] + nom[3] + nom[4]);
    }
}
