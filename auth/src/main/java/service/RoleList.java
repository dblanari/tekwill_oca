package service;

import model.Role;

import java.util.ArrayList;
import java.util.List;

public class RoleList {
    public static List<Role> roleList;

    static {
        roleList = new ArrayList<>();
        roleList.add(new Role("admin", Resources.resources));
        roleList.add(new Role("user", Resources.findUserPage()));
    }

    public static Role findByName(String name){
        for (Role role : roleList){
            if (role.getName().equals(name)){
                return role;
            }
        }
        return null;
    }
}
