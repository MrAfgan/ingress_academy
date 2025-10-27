import java.util.Arrays;
import java.util.Scanner;

public class Elcin {public static void main(String[] args) {
    int[] numb = new int[5];
    System.out.println("Besh reqem daxil et:");
    Scanner sk = new Scanner(System.in);
    for (int i = 0; i < numb.length; i++) {
        numb[i] = sk.nextInt();

    }
    Arrays.sort(numb);
    System.out.println(Arrays.toString(numb));

}
}
