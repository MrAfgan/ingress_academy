package ders.lesson15;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Map<String, List<Employee>> departments = new HashMap<>();
        List<Employee> newEmployee = new ArrayList<>();
        newEmployee.add(new Employee("Nurlan", 28, "Teacher"));
        departments.putIfAbsent("Ingress", newEmployee);
        departments.computeIfAbsent("Ingress", _ -> new ArrayList<>()).add(new Employee("Ahad", 27, "Mentor"));
        addEmployees(departments, "Ingress", "Miri", 22, "Security");
        addEmployees(departments, "Ingress", "Aga", 33, "Help Desk");
        addEmployees(departments, "Jet Academy", "Konul", 26, "SMM Manager");
        addEmployees(departments, "Jet Academy", "Sanan", 28, "Teacher");
        addEmployees(departments, "Code Academy", "Vidadi", 45, "Director");
        addEmployees(departments, "Step Academy", "Ilyas", 38, "Project Manager");
        addEmployees(departments, "Step Academy", "Rena", 27, "Mentor");
        addEmployees(departments, "Step Academy", "Vasif", 38, "Technican");
        System.out.println(departments);
        System.out.println();
        System.out.println("Higher number of employees at: "+getMostWorkerCount(departments));

    }

    public static void addEmployees(Map<String, List<Employee>> departments, String dep, String name, int age, String job) {
        Employee newEmployee = new Employee(name, age, job);
        List<Employee> employees = departments.computeIfAbsent(dep, _ -> new ArrayList<>());
        if (!employees.contains(newEmployee)) {
            employees.add(newEmployee);
            Collections.sort(departments.get(dep));
            System.out.println("This participant successfully added..");
            System.out.println();
        } else {
            System.out.println("This participant already in company list..");
        }
    }

    public static String getMostWorkerCount(Map<String, List<Employee>> departments) {
        int maxWorkersCount = 0;
        String winnerDepartment = null;
        for (Map.Entry<String, List<Employee>> entry : departments.entrySet()) {
            if (entry.getValue().size() > maxWorkersCount) {
                maxWorkersCount = entry.getValue().size();
                winnerDepartment=entry.getKey();
            }
        }return winnerDepartment;
    }

}