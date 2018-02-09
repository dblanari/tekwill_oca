package service;

import api.Resource;
import model.Role;

import java.util.ArrayList;
import java.util.List;

public class RoleList {
    public static List<Role> rolesList;

    static {
        rolesList = new ArrayList<>();
        rolesList.add(new Role("user", Resources.findUserPage()));
        rolesList.add(new Role("admin", Resources.resources));
    }

    public static Role findByRole(String name) {

        for (int i = 0; i < rolesList.size(); i++) {
            if (rolesList.get(i).getName().equals(name)) {
                return rolesList.get(i);
            }
        }
        return null;

    }
}
