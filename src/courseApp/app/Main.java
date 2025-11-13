package courseApp.app;

import courseApp.entity.Admin;
import courseApp.service.AdminService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin("Admin", "1234");
        AdminService adminService = new AdminService();
        Scanner sc = new Scanner(System.in);
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

                    boolean correct = admin.login(login, password);

                    if (!correct) {
                        System.out.println("Yalnis loqin yaxud password");
                        break;
                    }
                    while (true) {
                        System.out.println("== ADMIN PANEL ==");
                        System.out.println("1. Telebe elave et");
                        System.out.println("2. Kurs elave et");
                        System.out.println("3. Telebeni kursa teyin et");
                        System.out.println("4. Telebeleri goster");
                        System.out.println("5. Kurslari goster");
                        System.out.println("6. Geri qayit");

                        if (!sc.hasNextInt()){
                            System.out.println("Yalniz reqem daxil edin!");
                            sc.next();
                            continue;
                        }
                        int adminChoice= sc.nextInt();
                        switch (adminChoice){
                            case 1:adminService.addStudent(null);
                            break;
                            case 2:adminService.addCourse(null);
                            break;
                            case 3:adminService.assignStudentToCourse(null,null);
                            break;
                            case 4:adminService.getStudentService().listStudents();
                            break;
                            case 5:adminService.getCourseService().listCourses();
                            break;
                            case 6:
                                System.out.println("Geri qayidilir!");
                                break;
                            default:
                                System.out.println("Yanlis secim!");
                        }


            }

            case 2:
                break;
            case 3:
                return;
        }
        while (true) {

        }
    }
}
}