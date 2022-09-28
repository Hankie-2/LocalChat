package kg.charginov.chat.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.HashMap;

@Getter
@Setter
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Conversation {

    String name;

    ArrayList<User> clients;

    ArrayList<Message> messages;

    @Override
    public String toString() {
        return "Беседа{" +
                " Название=" + name +
                " Пользователи=" + clients +
                ",Сообщения=" + messages +
                '}';
    }
}
