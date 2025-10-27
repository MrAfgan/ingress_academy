package lesson8AhadHomework;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        System.out.println("Parolu daxil edin:");
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        if (password.equals("admin123")) {
            System.out.println("Daxil oldunuz");

        }else System.out.println("Yanlış parol");
    }
}
