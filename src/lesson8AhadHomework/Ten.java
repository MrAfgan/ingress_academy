package lesson8AhadHomework;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        int balance = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Emeliyyati secin: ");
        System.out.println("Medaxil ucun (+) daxil edin");
        System.out.println("Mexaric ucun (-) daxil edin");
        String operation = sc.next();
        System.out.println("Meblegi daxil edin");
        int amount = sc.nextInt();
        if (operation.equals("+")) {
            System.out.println("Balance: " + (balance + amount));

        }else if (operation.equals("-")){
            System.out.println("Balance: "+ (balance-amount));
        }
    }
}
