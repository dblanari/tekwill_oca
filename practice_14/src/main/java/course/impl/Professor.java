package course.impl;

public class Professor extends Staff {
    public Professor(String text) {
        super(text);
    }

    @Override
    public String getRole() {
        return "Professor";
    }
}
