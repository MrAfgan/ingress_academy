package gptLessons;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println("Checking -pozitive,Negative or zero!");
        System.out.println("----------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numb:");
        int eded = sc.nextInt();
        if (eded > 0) {
            System.out.println("Positive!");

        } else if (eded == 0) {
            System.out.println("Negative");

        } else System.out.println("Zero");
    }
}
