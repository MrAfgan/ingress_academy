package chapter3;

import java.util.Arrays;

public class Chr2 {
    public static void main(String[] args) {
//        String[] words = {"one", "two", "three"};
//        for (String w : words) {
//            w = w.toUpperCase();
//            System.out.println(w);
//        }
        String[] words1 = {"one", "two", "three"};
        for (int i = 0; i < words1.length; i++) {
            words1[i]=words1[i].toUpperCase();
        }
        System.out.println(Arrays.toString(words1));
    }
}
