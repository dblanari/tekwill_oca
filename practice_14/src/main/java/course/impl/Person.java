package course.impl;

import course.api.Character;

public class Person implements Character {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String text) {
        String[] data = text.split(" ");
        firstName = data[0];
        lastName = data[1];
        age = Integer.parseInt(data[2]);
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
