package gptChapter3;

public class Str {
    public static void main(String[] args) {
        String s = "JavaProgramming";
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.substring(0,4));
        System.out.println(s.substring(8));
        System.out.println(s.contains("ogr"));
        System.out.println(s.startsWith("Ja"));
        System.out.println(s.endsWith("ing"));
        System.out.println(s.indexOf("P"));
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
    }
}
