package lamda.generic;

public class Main {
    public static void main(String[] args) {
        StringPrinter sp = new StringPrinter();
        sp.print("Salam");
        IntegerPrinter intp = new IntegerPrinter();
        intp.intPrinter(2);
        PrintSomething<Double> ps=new PrintSomething<>(2.5);
        PrintSomething<String> ps1=new PrintSomething<>("A");
        ps.print();
        ps1.print();

        }
    }
