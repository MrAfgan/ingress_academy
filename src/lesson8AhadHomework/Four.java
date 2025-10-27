package lesson8AhadHomework;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Ballarin hesablanmasi");
        System.out.println("---------------------");
        System.out.println();
        Scanner ss = new Scanner(System.in);
        System.out.println("Topladiginiz bali daxil edin:");
        int bal = ss.nextInt();
        if (bal >= 50) {
            System.out.println("Kecdin!");

        } else System.out.println("kesildin!");
    }
}
