package course.impl;

public class Student extends Staff {
    public Student(String text) {
        super(text);
    }

    @Override
    public String getRole() {
        return "Student";
    }
}
