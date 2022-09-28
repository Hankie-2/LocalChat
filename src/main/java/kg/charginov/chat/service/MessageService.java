package kg.charginov.chat.service;

import kg.charginov.chat.model.Message;
import kg.charginov.chat.model.User;

import java.util.ArrayList;
import java.util.HashMap;

public interface MessageService {

    public ArrayList<Message> listOfMessagesByUser(ArrayList<Message> messages1, User user);

    public ArrayList<Message> listOfMessagesByUserWithModerator(ArrayList<Message> messages1, User user);

}
