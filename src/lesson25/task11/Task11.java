package lesson25.task11;

public class Task11 {
    static Calculator addition = (a, b) -> System.out.println("Cavab:" + (a + b));

    static Calculator subtraction = (a, b) -> System.out.println("Cavab:" + (a - b));

    static Calculator multiplication = (a, b) -> System.out.println("Cavab:" + (a * b));

    static Calculator division = (a, b) -> {
        if (b == 0) {
            System.out.println("Sifira bolmek olmaz");
        } else System.out.println("Cavab:" + (a / b));

    };
}
