package gptChapter3;

import java.util.Scanner;

public class Strb4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bir cumle daxil et!");
        StringBuilder sentence = new StringBuilder(sc.next());
        System.out.println("Evez etmek istediyin soz?");
        String word = sc.next();
        System.out.println("Hansi setirden evez etsin");
        int replaceStart = sc.nextInt();
        System.out.println("Hansi setredek evez etsin");
        int replaceEnd = sc.nextInt();
        if (replaceStart >= sentence.length() && replaceEnd > sentence.length()) {
            System.out.println("Evez etmek istediyin setir bu cumleden kenara cixir");
        } else {
            StringBuilder replaced = sentence.replace(replaceStart, replaceEnd, word);
            System.out.println(replaced);
        }
    }
}
