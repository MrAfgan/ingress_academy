package courseApp.service;

import courseApp.db.DataBase;
import courseApp.entity.Student;

public class StudentService {
    public void addStudent(Student s) {
        DataBase.students.add(s);
        System.out.println("Telebe elave olundu: " + s.getName() + " " + s.getSurname());
    }

    public void listStudents() {
        if (DataBase.students.isEmpty()) {
            System.out.println("Siyahida hec bir telebe yoxdur");
            return;
        }
        for (Student s : DataBase.students) {
            System.out.println(s);
        }
    }
}
