package service;

import model.User;

import java.util.List;
import java.util.Optional;

public class Authentication {

    private List<User> users;
    private User user;

    public Authentication(List<User> users) {
        this.users = users;
    }

    public boolean login(String username, String password) {
        Optional<User> op = users.stream()
                .filter(it -> it.getName().equals(username) && it.getPassword().equals(password))
                .findFirst();
        if (op.isPresent()) {
            user = op.get();
            return true;
        }
        return false;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
