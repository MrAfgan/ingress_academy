package ders.lesson7;

import java.util.Scanner;

public class homework2dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int summ = 0;
        int numb;
        do {
            System.out.println("Novbeti ededi daxil edin: ");
            numb = sc.nextInt();
            if (numb >= 0) {
                summ += numb;


            }
        }while (numb >= 0) ;
            System.out.println("Yekun reqem " + summ);

    }
}