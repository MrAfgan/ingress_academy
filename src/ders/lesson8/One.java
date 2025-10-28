package ders.lesson8;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        System.out.println("-----------------------");
        System.out.println("Musbet ededin tapilmasi");
        System.out.println("-----------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int eded = sc.nextInt();
        if (eded > 0) {
            System.out.println("Eded musbetdir!");
        } else if (eded == 0) {
            System.out.println("Eded sifira beraberdir!");
        } else System.out.println("Eded menfidir!");

    }
}




