package lesson25Easy.task3;

import java.util.List;

public class Main extends Task3 {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Anan", 19),
                new Person("Tural", 12),
                new Person("Oqtay", 18),
                new Person("Kanan", 17),
                new Person("Rauf", 8),
                new Person("Fuad", 45),
                new Person("Vasif", 60),
                new Person("Samir", 20));
        filterPersons(people,isAdult);
    }
}
