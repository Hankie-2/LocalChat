package kg.charginov.chat;

import kg.charginov.chat.model.*;
import kg.charginov.chat.service.AdminService;
import kg.charginov.chat.service.EncryptionService;
import kg.charginov.chat.service.MessageService;
import kg.charginov.chat.service.UserService;
import kg.charginov.chat.service.impl.AdminServiceImpl;
import kg.charginov.chat.service.impl.EncryptionServiceImpl;
import kg.charginov.chat.service.impl.MessageServiceImpl;
import kg.charginov.chat.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    private static UserService userService = new UserServiceImpl();
    private static EncryptionService encryptionService = new EncryptionServiceImpl();
    private static MessageService messageService = new MessageServiceImpl();
    private static AdminService adminService = new AdminServiceImpl();

    public static void main(String[] args) {

        User client1 = new Client(1,"marsel123","charginov323202");
        userService.registerUser(client1);
        User client2 = new Client(2321,"emil2002","2c312harginov2002");
        userService.registerUser(client2);

        User moderator1 = new Moderator(3,"moderator1","moder123");
        userService.registerUser(moderator1);

        ArrayList<User> users = new ArrayList<>();
        users.add(client1);
        users.add(client2);
        users.add(moderator1);


        Message message1 = new Message("marsel ne bomj",client2,client1);
        Message message2 = new Message("privet как тебя зовут ",moderator1,client2);
        Message message3 = new Message("","C:/dd/dd/dd",client2);

        Conversation conversation1 = new Conversation();
        conversation1.setClients(users);
        conversation1.setName("AIN-1-20");

        ArrayList<Message> usersMessage = new ArrayList<>();
        usersMessage.add(message1);
        usersMessage.add(message2);
        usersMessage.add(message3);
        conversation1.setMessages(usersMessage);
        System.out.println(conversation1.getMessages());

//        System.out.println(messageService.listOfMessagesByUser(conversation1.getMessages(),client1));
//        System.out.println(messageService.listOfMessagesByUserWithModerator(conversation1.getMessages(),client1));
//        System.out.println(userService.getAllUser());
//        System.out.println(conversation1);

    }
}
