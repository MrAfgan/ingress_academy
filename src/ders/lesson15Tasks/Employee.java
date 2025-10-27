package ders.lesson15Tasks;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
    String name;
    int age;
    String job;

    public Employee(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee " +
                "Name=" + name  +
                ", Age=" + age +
                ", Job=" + job ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(job, employee.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, job);
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}