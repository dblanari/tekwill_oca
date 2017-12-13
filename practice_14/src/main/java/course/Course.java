package course;

import course.impl.PresenceImpl;
import course.impl.Staff;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private Group group;
    private int numberOfLesson;
    private List<Lesson> lessons;

    public Course(Group group, int numberOfLesson) {
        this.group = group;
        this.numberOfLesson = numberOfLesson;
        lessons = new ArrayList<>();
    }

    public void start() {
        for (int i = 0; i < numberOfLesson; i++) {
            Lesson lesson = new Lesson(group, new PresenceImpl(group), i + 1);
            lesson.start();
            lessons.add(lesson);
        }
    }

    public void printLessons() {
        lessons.forEach(it -> it.print());
    }


    public void printPresence() {
        System.out.println("Presence");
        for (Staff it : group.getListOfStaff()) {
            long num = lessons.stream()
                    .filter(l -> l.getPresence().isPresent(it))
                    .count();
            System.out.println(it + " a frecventat: " + num);
        }
    }
}
