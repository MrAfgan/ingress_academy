package freestyleLessons;

public class ForEasy4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i == 10) break;
            if (i % 3 == 0)continue;
            if (i % 2 == 1)
                System.out.println("odd");
            else {
                System.out.println(i);
            }
        }
    }
}
