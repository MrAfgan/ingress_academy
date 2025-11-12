package chapter3;

import java.util.Scanner;

public class Strb3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 words,name must cantaine minimum 4 characters");
        StringBuilder name = new StringBuilder(sc.next());
        System.out.println("daxil etmek istediyiniz setir?");
        int line= sc.nextInt();
        if (name.length() < 3 && line>name.length()) {
            System.out.println("ad cox qisadir");
        } else {
            StringBuilder name1 = new StringBuilder(sc.next());
            StringBuilder result = name.insert(line, name1);
            System.out.println(result);


        }
    }
}
