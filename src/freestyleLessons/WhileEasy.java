package freestyleLessons;

import java.util.Scanner;

public class WhileEasy {
    public static void main(String[] args) {
        int total = 0;
        int numb;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menfi eded dail edilenecen butun reqemler toplanilacaq");
        do {
            System.out.println("Reqem?");
            numb = sc.nextInt();
            if (numb > 0) {
                total += numb;
            }
        } while (numb >= 0);
        System.out.println(total);
    }
}
