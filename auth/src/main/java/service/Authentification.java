package service;

import model.User;

import java.util.Optional;

public class Authentification {
    User currentUser;

    public User getCurrentUser(){
        return currentUser;
    }

    public boolean login(String user, String password){
        Optional<User> op =  UserList.users.stream()
                .filter(myUser -> myUser.getName().equals(user) && myUser.getPassword().equals(password))
                .findFirst();
        if (op.isPresent()){
            currentUser = op.get();
            return true;
        }
        return false;
    }

    public boolean logout(){
        if (currentUser != null){
            currentUser = null;
            return true;
        }
        return false;
    }
}
