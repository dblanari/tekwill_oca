package service;

import model.User;

public class Authentification {

    User currentUser;

    public User getCurrentUser() {
        return currentUser;
    }

    public boolean login(String login, String password) {
        for (User u : UserList.users) {
            if (u.getUsername().equals(login) && u.getPassword().equals(password)) {
                currentUser = u;
                return true;
            }
        }
        return false;
    }


    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
}
