package Patika_3_Week.ProjeKitap.service;

import Patika_3_Week.ProjeKitap.User;

import java.util.HashSet;
import java.util.Set;

public class UserService {
    private static final Set<User> users = new HashSet<>();


    public void create(String name, String email, String password) {
        User user = new User(name, email, password);
        users.add(user);
    }

    public void list() {
        for (User user : users) {
            System.out.println(user.getName() + " -> " + user.getEmail());
        }
    }

    public User findUserByName(String username) {
        User foundUser = null;
        for (User user : users) {
            if (user.getName().equals(username)) {
                foundUser = user;
                break;
            }
        }
        return foundUser;
    }
}
