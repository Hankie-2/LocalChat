package kg.charginov.chat.service.impl;

import kg.charginov.chat.model.User;
import kg.charginov.chat.service.UserService;

import java.util.ArrayList;

public class UserServiceImpl implements UserService {

    private ArrayList<User> users = new ArrayList<>();

    @Override
    public void registerUser(User user){
        if(user==null){
            throw new NullPointerException("Object 'User' is null!");
        }
        users.add(user);
        user.setIsRegistered(true);
    }

    @Override
    public ArrayList<User> getAllUser(){
        return users;
    }

}
