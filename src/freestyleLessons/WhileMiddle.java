package freestyleLessons;

import java.util.Scanner;

public class WhileMiddle {
    public static void main(String[] args) {
        int total = 0;
        int numb;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menfi eded daxil edilenecen butun reqemler toplanilacaq");
        System.out.println("Reqem?");
        do {

            numb = sc.nextInt();
            if (numb > 0) {
                total += numb;
                System.out.println("Next numb?");

            } else if (numb == 0) {
                System.out.println("Next numb?");

            }
        } while (numb >= 0);
        System.out.println("Menfi ede daxil edildi");
        System.out.println("Total cem: " + total);
    }
}
