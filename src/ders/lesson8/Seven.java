package ders.lesson8;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        System.out.println("Balinizi daxil edin:");
        Scanner sc= new Scanner(System.in);
        int bal= sc.nextInt();
        if (bal >= 90) {
            System.out.println("A");
            
        }
        else if (bal >= 80) {
            System.out.println("B");

        }
        else if (bal >= 70) {
            System.out.println("C");

        } else if(bal>=60) {
            System.out.println("D");
        }else System.out.println("F");
    }
}
