package gptChapter3;

import java.util.Scanner;

public class Strb5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Your name?");
        StringBuilder sb=new StringBuilder(sc.next());
        System.out.println("cut from?");
        int cutStart= sc.nextInt();
        System.out.println("cut till?");
        int cutEnd= sc.nextInt();
        StringBuilder result=sb.delete(cutStart,cutEnd);
        if (cutStart>=sb.length() && cutEnd>sb.length()) {
            System.out.println("Kesmek istediyin setre nezeren ad cox qisadir");
        }else {
            System.out.println(result);
        }
        }
    }
