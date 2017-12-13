package course;

import course.impl.Staff;

import java.util.List;
import java.util.stream.Collectors;

public class Group {
    private List<Staff> listOfStaff;

    public Group(List<Staff> listOfStaff) {
        this.listOfStaff = listOfStaff;
    }

    public List<Staff> getListOfStaff() {
        return listOfStaff;
    }

    public void setListOfStaff(List<Staff> listOfStaff) {
        this.listOfStaff = listOfStaff;
    }

    public List<Staff> students() {
        return listOfStaff.stream()
                .filter(it -> it.getRole().equals("Student"))
                .collect(Collectors.toList());

    }

    public List<Staff> proffesor() {
        return listOfStaff.stream()
                .filter(it -> it.getRole().equals("Professor"))
                .collect(Collectors.toList());
    }
}
