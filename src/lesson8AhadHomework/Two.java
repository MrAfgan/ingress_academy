package lesson8AhadHomework;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("Ededin cut yaxud tek olmasinin teyin edilmesi:");
        System.out.println("---------------------------------------------");
        System.out.println();
        Scanner sk = new Scanner(System.in);
        System.out.println("Ededi daxil edin");
        int eded1 = sk.nextInt();
        if (eded1 % 2 == 0) {
            System.out.println("Daxil etdiyiniz eded cutdur!");

        } else System.out.println("Daxil etdiyiniz eded tekdir!");
    }
}
