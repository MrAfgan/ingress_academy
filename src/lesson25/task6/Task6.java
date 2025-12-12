package lesson25.task6;

public class Task6 {
    static Greeter greeter = name -> System.out.println("Salam " + name+"!");
    public static void greeting(String someone,Greeter g){
        g.greet(someone);
    }
}
