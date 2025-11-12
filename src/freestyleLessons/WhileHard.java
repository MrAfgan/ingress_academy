package freestyleLessons;

import java.util.Random;
import java.util.Scanner;

public class WhileHard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int secret = r.nextInt(10) + 1;
        System.out.println("1-10 araligi ededi daxil edin");
        int numb;
        do {
            numb = sc.nextInt();
            if ( numb > 10) {
                System.out.println("Yalnis ededdir,cunki 10dan boyukdur!");

            }else if (numb<0) {
                System.out.println("Yalnis ededdir,cunki menfidir!");

            }else if (numb != secret) {
                System.out.println("Yalnisdir,yeniden tapmaga cehd edin!");

            }else if (numb == 0) {
                System.out.println("Sifir yalnis reqemdir, tapmaq istediyimiz reqem araligina dusmur!");

            }

        } while (numb != secret);
        System.out.println("Tebrikler duzgun tapdiniz!");
    }
}
