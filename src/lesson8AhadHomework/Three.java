package lesson8AhadHomework;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("Boyuk ededin tapilmasi");
        System.out.println("----------------------");
        System.out.println();
        Scanner st = new Scanner(System.in);
        System.out.println("Ilk ededi daxil edin:");
        int eded2 = st.nextInt();
        System.out.println("Ikinci ededi daxil edin:");
        int eded3 = st.nextInt();
        if (eded2 > eded3) {
            System.out.println(eded2 + " ededi " + eded3 + " ededinden boyukdur!");

        } else if (eded2 == eded3) {
            System.out.println("Ededler beraberdir!");
            System.out.println();

        } else System.out.println(eded3 + " ededi " + eded2 + " ededinde boyukdur");
    }
}
