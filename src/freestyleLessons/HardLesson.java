package freestyleLessons;

import java.util.Scanner;

public class HardLesson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        if (numb != 0) {
            if (numb < 0) {
                System.out.println("Negative");

            } else if (numb % 2 == 0) {
                System.out.println("Positive Even");

            } else System.out.println("Negative Odd");
        } else System.out.println("Zero");

    }
}
