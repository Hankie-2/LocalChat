package kg.charginov.chat.service;

import kg.charginov.chat.model.User;

import java.util.ArrayList;

public interface UserService {

    public void registerUser(User user);
    public ArrayList<User> getAllUser();

}
