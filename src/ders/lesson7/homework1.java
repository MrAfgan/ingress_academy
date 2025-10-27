package ders.lesson7;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededi daxil et:");
        int eded = sc.nextInt();
        for (int i = 1; i <= eded; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }

}

