package courseApp.service;

import courseApp.db.DataBase;
import courseApp.entity.Course;
import courseApp.entity.Student;

import java.util.Scanner;

public class AdminService {
    private StudentService studentService = new StudentService();

    public StudentService getStudentService() {
        return studentService;
    }

    private CourseService courseService = new CourseService();

    public CourseService getCourseService() {
        return courseService;
    }

    public void addStudent(Student student) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Telebenin adi?");
        String name = sc.next();
        System.out.println("Telebenin soyadi?");
        String surname = sc.next();
        System.out.println("Telebenin yasi?");
        int age = sc.nextInt();
        Student s = new Student(name, surname, age);
        studentService.addStudent(s);
    }

    public void addCourse(Course course) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kursun adi?");
        String name = sc.next();
        System.out.println("Muellimin adi?");
        String teacher = sc.next();
        System.out.println("Kursun teyinati?");
        String description = sc.next();
        Course c = new Course(name, teacher, description);
        courseService.addCourse(c);
    }

    public void assignStudentToCourse(Student S, Course C) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Telebelerin siyahisi:");
        System.out.println();
        studentService.listStudents();
        System.out.println();
        if (DataBase.students.isEmpty()) {
            System.out.println("Sistemde bele bir telebe yoxdur");
            return;
        }
        System.out.println("Muvafiq telebeni secin:");

        int studentIndex = sc.nextInt() - 1;
        if (studentIndex > 0 || studentIndex >= DataBase.students.size()) {
            System.out.println("Yalnis secim");
            return;

        }
        System.out.println();
        System.out.println("Kurslarin siyahisi:");
        System.out.println();
        courseService.listCourses();
        System.out.println();
        if (DataBase.courses.isEmpty()) {
            System.out.println("Sistemde bele bir kurs yoxdur");
            return;
        }
        System.out.println("Muvafiq kursu secin:");
        int courseIndex = sc.nextInt() - 1;
        if (courseIndex > 0 || courseIndex >= DataBase.courses.size()) {
            System.out.println("Yalnis secim");
            return;
        }
        System.out.println();
        Student selectedStudent = DataBase.students.get(studentIndex);
        Course selectedCourse = DataBase.courses.get(courseIndex);
        selectedStudent.addCourse(selectedCourse);
        System.out.println(selectedStudent.getName() + " " + selectedStudent.getSurname() + " : " + selectedCourse.getName() + "- kursuna elave olundu");
    }
}
