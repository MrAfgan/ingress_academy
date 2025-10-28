package ders.lesson6;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        boolean isMarried;
        boolean isWorking;
        boolean isRich;

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess is he married,answer only true or false");
        isMarried = sc.nextBoolean();
        System.out.println("Guess is he working,answer only true or false");
        isWorking = sc.nextBoolean();
        System.out.println("Guess is he rich,answer only true or false");
        isRich = sc.nextBoolean();
        if (isMarried && isWorking && !isRich) System.out.println("all 3 answer true");
        else if (!(isMarried || isWorking || !isRich)) System.out.println("all 3 answer wrong");
        else System.out.println("minimum one answer is correct");
    }
}
