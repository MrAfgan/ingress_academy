package praktika;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Anna", 20, true),
                new User("Alex", 17, false),
                new User("Bob", 25, true),
                new User("Arzu", 30, false),
                new User("Kanan", 15, true)
        );
        Predicate<User> isAdult = user -> user.getAge() > 20;
        Predicate<User> startWithA = user -> user.getName().startsWith("a");
        Predicate<User> isActive = user -> user.isActive();
        filter(users,isAdult);
        filter(users,startWithA);
        filter(users,isActive);

    }

    public static void filter(List<User> list, Predicate<User> predicate) {
        for (User u : list) {
            if (predicate.test(u)) {
                System.out.println(u);
            }
        }
    }
}
