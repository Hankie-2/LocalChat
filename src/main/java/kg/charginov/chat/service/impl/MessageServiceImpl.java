package kg.charginov.chat.service.impl;

import kg.charginov.chat.model.Message;
import kg.charginov.chat.model.User;
import kg.charginov.chat.model.enums.Role;
import kg.charginov.chat.service.MessageService;

import java.util.ArrayList;

public class MessageServiceImpl implements MessageService {

    private ArrayList<Message> messages;

    public ArrayList<Message> listOfMessagesByUser(ArrayList<Message> messages1, User user){
        messages = new ArrayList<>();
        for(Message message:messages1){
            try{
                if(message.getFrom()==user && message.getTo().getRole()== Role.USER){
                    messages.add(message);
                }
            }catch (NullPointerException e){
                e.printStackTrace();
            }
        }
        return messages;
    }

    public ArrayList<Message> listOfMessagesByUserWithModerator(ArrayList<Message> messages1,User user){
        messages = new ArrayList<>();
        for(Message message:messages1){
            try{
                if(message.getFrom()==user && message.getTo().getRole()== Role.MODERATOR){
                    messages.add(message);
                }
            }catch (NullPointerException e){
                System.out.println("");
            }
        }
        return messages;
    }

}
