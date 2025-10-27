package gptChapter3;

import java.util.Scanner;

public class Chr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name?!");
        String name = sc.next();
        char[] letters = name.toCharArray();
        for (char ch : letters) System.out.println(ch);


        }

    }

