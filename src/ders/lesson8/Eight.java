package ders.lesson8;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        System.out.println("Heftenin gunleri");
        System.out.println("----------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Gunu daxil edin:");
        int gun = sc.nextInt();
        if (gun == 1) {
            System.out.println("Bazar ertesi");

        } else if (gun == 2) {
            System.out.println("Cersenbe axsami");

        } else if (gun == 3) {
            System.out.println("Cersembe");

        } else if (gun == 4) {
            System.out.println("Cume axsami");

        } else if (gun == 5) {
            System.out.println("Cume");

        } else if (gun == 6) {
            System.out.println("Senbe");

        } else if (gun == 7) {
            System.out.println("Bazar");

        } else System.out.println("Heftenin gunleri yalniz 1-7 araliginda ola biler!");
    }
}
