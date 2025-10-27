package gptChapter3;

public class Str2 {
    public static void main(String[] args) {
        String s = "HelloWorld";
        String s1 = "     Java     ";
        String s2 = s.substring(0, 5);
        String s3 = s.substring(5);
        System.out.println(s.substring(0, 5));
        System.out.println(s.substring(5));
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1.trim());
        System.out.println(s2.concat(s3));

    }
}