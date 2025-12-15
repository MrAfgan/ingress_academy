package lesson25Easy.task3;

import java.util.List;
import java.util.function.Predicate;

public class Task3 {
    static Predicate<Integer> isAdult = age -> age >=18;
    public static void filterPersons(List<Person>list, Predicate<Integer>predicate){
        for (Person p:list){
            if (predicate.test(p.getAge())){
                System.out.println("This person is adult: "+p.getName());
            }else System.out.println("This person under 18 : "+p.getName());
        }
    }
}
