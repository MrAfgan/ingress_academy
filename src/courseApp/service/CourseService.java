package courseApp.service;

import courseApp.db.DataBase;
import courseApp.entity.Course;

public class CourseService {
    public void addCourse(Course c) {
        DataBase.courses.add(c);
        System.out.println(c.getName()+" kursu elave olundu");
    }

    public void listCourses() {
        if (DataBase.courses.isEmpty()) {
            System.out.println("Sistemde bele bir kurs yoxdur!");
            return;
        }
        for (Course c : DataBase.courses) {
            System.out.println(c);
        }
    }
}
