package gptLessons;

import java.util.Scanner;

public class Ternarla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        String result = (numb == 0) ? "Zero"
        :(numb < 0) ? "Negative"
        :(numb%2==0)?"Positive Even"
                :"Positive Odd";
        System.out.println(result);
    }
}
