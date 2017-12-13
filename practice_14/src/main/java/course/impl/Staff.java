package course.impl;

import course.api.Role;

public abstract class Staff extends Person implements Role {
    public Staff(String text) {
        super(text);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Role=")
                .append(getRole())
                .append(", {")
                .append(getFirstName())
                .append(", ")
                .append(getLastName())
                .append(", ")
                .append(getAge())
                .append("}");
        return sb.toString();
    }
}
