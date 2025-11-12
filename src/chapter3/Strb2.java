package chapter3;

import java.util.Scanner;

public class Strb2 {
    public static void main(String[] args) {
        StringBuilder sb;
        System.out.println("enter 2 word?");
        Scanner sc = new Scanner(System.in);
        StringBuilder word = new StringBuilder(sc.next());
        StringBuilder word1 =new StringBuilder(sc.next());
        sb=word.append(word1);
        System.out.println(sb);
    }
}
