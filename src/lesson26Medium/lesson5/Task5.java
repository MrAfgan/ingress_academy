package lesson26Medium.lesson5;


import lesson26Medium.Person;

import java.util.Comparator;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Mikail", 43),
                new Person("Imran", 35),
                new Person("Nasib", 29),
                new Person("Afgan", 38),
                new Person("Rasim", 26),
                new Person("Kamran", 53),
                new Person("Igor", 33));
        people.stream().filter(p -> p.getAge() > 30).sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);
    }
}
