package praktika;

import java.util.List;
import java.util.function.Predicate;

public class a {
    public static void main(String[] args) {
        List<Integer> list= List.of(1,3,4,2);
//        for (int i:list){
//            if (i%2==1){
//                System.out.println(i);
//            }
//        }
        Predicate<Integer> list1 =integer->integer%2==1;
        System.out.println(list.stream().filter(integer -> integer % 2 == 1).count());
    }
}
