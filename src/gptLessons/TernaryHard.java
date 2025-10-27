package gptLessons;

import java.util.Scanner;

public class TernaryHard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        String result = (numb == 0) ? "Zero"
                : (numb < 0 && numb % 2 == 0) ? "Negative Even"
                : (numb < 0) ? "Negative Odd"
                : (numb % 5 == 0) ? "Positive Multiple of 5"
                : "Positive Not Multiple of 5";
        System.out.println(result);
    }
}
