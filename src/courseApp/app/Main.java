package courseApp.app;

import courseApp.db.DataBase;
import courseApp.entity.Admin;
import courseApp.entity.Course;
import courseApp.entity.Student;
import courseApp.service.AdminService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataBase.students.add(new Student("Aysel", "Memmedova", 21));
        DataBase.courses.add(new Course("Java OCA", "Ehed", "OCA imtahanlarina hazirliq and Java Learning"));
        DataBase.students.get(0).addCourse(DataBase.courses.get(0));
        Admin admin = new Admin("Admin", "1234");
        AdminService adminService = new AdminService();
        Scanner sc = new Scanner(System.in);
        outerLoopLabel:
        while (true) {
            System.out.println("""
                    === COURSE MANAGEMENT SYSTEM ===
                    1. Admin kimi daxil ol
                    2. Tələbə kimi daxil ol
                    3. Çıxış
                    Seçiminizi daxil edin:""");

            if (!(sc.hasNextInt())) {
                System.out.println("Zehmet olmasa yalniz reqem daxil edin!");
                sc.next();
                continue;
            }
            int choice = sc.nextInt();

            if (choice < 1 || choice > 3) {
                System.out.println("Yalnis secim!");
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.println("Loqin daxil et!");
                    String login = sc.next();
                    System.out.println("Parolu daxil et!");
                    String password = sc.next();

                    boolean correctLogin = admin.login(login, password);

                    if (!correctLogin) break;
                    adminLoop:
                    while (true) {
                        System.out.println("== ADMIN PANEL ==");
                        System.out.println("1. Telebe elave et");
                        System.out.println("2. Kurs elave et");
                        System.out.println("3. Telebeni kursa teyin et");
                        System.out.println("4. Telebeleri goster");
                        System.out.println("5. Kurslari goster");
                        System.out.println("6. Geri qayit");

                        if (!sc.hasNextInt()) {
                            System.out.println("Yalniz reqem daxil edin!");
                            sc.next();
                            continue;
                        }
                        int adminChoice = sc.nextInt();

                        switch (adminChoice) {
                            case 1: adminService.addStudent();break;
                            case 2: adminService.addCourse();break;
                            case 3: adminService.assignStudentToCourse();break;
                            case 4: adminService.getStudentService().listStudents();break;
                            case 5: adminService.getCourseService().listCourses();break;
                            case 6: System.out.println("Geri qayidilir!");break adminLoop;
                            default: System.out.println("Yanlis secim!");
                        }
                    }
                    break;

                case 2:
                    System.out.println("Adinizi daxil edin.");
                    String name = sc.next();
                    System.out.println("Soyadinizi daxil edin.");
                    String surname = sc.next();
                    Student found = adminService.getStudentService().findStudentByNameAndSurname(name, surname);
                    if (found == null) {
                        System.out.println("Bele telebe yoxdur");
                    } else {
                        System.out.println("===Telebe profili===");
                        System.out.println(found.toString());

                    }
                    break;

                case 3: break outerLoopLabel;
            }

        }
    }
}
