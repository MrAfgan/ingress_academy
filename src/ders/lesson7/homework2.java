package ders.lesson7;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int summ = 0;
        int numb;
        while (true) {
            System.out.println("Ededi daxil edin:");
            numb = sc.nextInt();
            if (numb < 0) break;
            summ += numb;
        }
        System.out.println("Reqemlerin cemi " + summ);
    }


}