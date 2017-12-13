package course;

import course.impl.Professor;
import course.impl.Staff;
import course.impl.Student;

import java.util.ArrayList;
import java.util.List;

public class Tekwill {
    public static void main(String[] args) {
        List<Staff> staffList = new ArrayList<>();
        staffList.add(new Professor("Denis B 30"));
        staffList.add(new Professor("Radu J 28"));
        staffList.add(new Professor("Andrei F 28"));
        staffList.add(new Professor("Vitalie D 28"));
        staffList.add(new Student("Sergiu S 29"));
        staffList.add(new Student("Serghei P 29"));
        staffList.add(new Student("Iulian Iulian 29"));
        staffList.add(new Student("Bogdan Bogdan 29"));

        Group group = new Group(staffList);
        Course courseOCA = new Course(group, 10);

        courseOCA.start();
        courseOCA.printLessons();
        courseOCA.printPresence();
    }
}
