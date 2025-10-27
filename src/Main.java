import ders.Person;

public class Main {
    public static void main() {
        Person vasifPerson = new Person();
        vasifPerson.setName("Vasif");
        vasifPerson.setSalary(3500d);

        Person kenanPerson = new Person();
        kenanPerson.setName("Kenan");
        kenanPerson.setSalary(120);
        System.out.println(vasifPerson.getName());
    }
}
