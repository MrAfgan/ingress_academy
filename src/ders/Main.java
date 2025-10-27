package ders;

public class Main {
    public static void main(String[] args) {Person vasifPerson = new Person();
        vasifPerson.setName("Vasif");
        vasifPerson.setSalary(3500d);
        vasifPerson.married = true;
        vasifPerson.age = 43;

        Person kenanPerson = new Person();
        kenanPerson.setName("Kenan");
        kenanPerson.setSalary(120d);
        System.out.println(vasifPerson.salary);

    }
}