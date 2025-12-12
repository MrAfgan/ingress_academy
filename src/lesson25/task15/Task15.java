package lesson25.task15;

import java.util.List;
import java.util.function.Predicate;

public class Task15 {
    static Predicate<String> palindrome = s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());

    public static void isPalindrome(List<String> list, Predicate<String> predicate) {
        for (String s : list) {
            if (predicate.test(s)) {
                System.out.println(s + " -(Bu soz polindromdur!)");

            } else System.out.println(s + " -(Bu soz polindrom deyil!)");
        }
    }
}
