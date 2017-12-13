package course;

import course.api.Presence;

public class Lesson {
    private Group group;
    private Presence presence;
    private int number;

    public Lesson(Group group, Presence presence, int number) {
        this.group = group;
        this.presence = presence;
        this.number = number;
    }

    public void start() {
        presence.check();
    }

    public Presence getPresence() {
        return presence;
    }

    public void print() {
        System.out.println("Lesson: " + number);
        group.getListOfStaff()
                .stream()
                .filter(it -> presence.isPresent(it))
                .forEach(it -> System.out.println(it));
    }
}
