package service;

import model.Role;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserList {
   public static List<User> users ;
   static {
       users = new ArrayList<>();
       users.add(new User("user", "user", RoleList.findByRole("user")));
       users.add(new User("admin", "etot", RoleList.findByRole("admin")));


   }
   public static User createUser(String userName, String password){
       User user = new User(userName,password, RoleList.findByRole("user"));
       users.add(user);
       return user;
   }


}
