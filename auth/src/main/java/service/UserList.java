package service;

import model.Role;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserList {

    public static List<User> users;

    static {
        users = new ArrayList<>();
        users.add(new User("Jora", "12345", RoleList.findByName("user")));
        users.add(new User("Vasea", "54321", RoleList.findByName("admin")));
    }

    public static void createUser(String name, String password){
        users.add(new User(name, password, RoleList.findByName("user")));
    }
}