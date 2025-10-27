package gptChapter3;

import java.util.Scanner;

public class ArrayForMiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxnumb;
        int summary = 0;
        System.out.println("Array olcusunu ve onun ededlerini daxil edin");
        int arrlength = sc.nextInt();
        int[] arrays = new int[arrlength];
        arrays[0] = sc.nextInt();
        int minnumb = arrays[0];
        maxnumb = arrays[0];
        summary += arrays[0];
        for (int i = 1; i < arrays.length; i++) {
            arrays[i] = sc.nextInt();
            summary += arrays[i];
            if (arrays[i] > maxnumb) maxnumb = arrays[i];
            if (arrays[i] < minnumb) minnumb = arrays[i];
        }
        System.out.println("minnumb " + minnumb);
        System.out.println("maxnumb " + maxnumb);
        System.out.println("summary " + summary);


    }
}
