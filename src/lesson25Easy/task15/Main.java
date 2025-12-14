package lesson25Easy.task15;

import java.util.List;

public class Main extends Task15 {
    public static void main(String[] args) {
        List<String> words = List.of(
                "Baba",
                "Ata",
                "Kabab",
                "Qabaq",
                "Buruq"
        );
        isPalindrome(words, palindrome);
    }
}
