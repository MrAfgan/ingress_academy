package freestyleLessons;

import java.util.Scanner;

public class TernarPointInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int score = sc.nextInt();
        String result =(score>100 || score<0 )?"Yanlış bal daxil edildi!"
                :(score>=90)?"A"
                :(score>=80)?"B"
                :(score>=70)?"C"
                :(score>=60)?"D"
                :"F";

        System.out.println(result);
    }
}
