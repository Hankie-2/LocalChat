package kg.charginov.chat.model;

import kg.charginov.chat.service.MessageService;
import kg.charginov.chat.service.TextCheckService;
import kg.charginov.chat.service.TranslateEnToRusService;
import kg.charginov.chat.service.impl.MessageServiceImpl;
import kg.charginov.chat.service.impl.TextCheckServiceImpl;
import kg.charginov.chat.service.impl.TranslateEnToRusServiceImpl;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Message {

    String text;

    User to;

    User from;

    LocalDateTime timeStamp;

    MessageService messageService = new MessageServiceImpl();

    TranslateEnToRusService translateService = new TranslateEnToRusServiceImpl();

    TextCheckService textCheckService = new TextCheckServiceImpl();

    String file;

    public Message(String text,String file,User from){
        if(file==null || file.isEmpty()){
            throw new NullPointerException("File is empty");
        }
        String mess = translateService.translateEnToRus(text);
        this.text = text.isEmpty()?"":textCheckService.checkBadWords(mess);
        this.file = file;
        this.timeStamp = LocalDateTime.now();
        this.from = from;
    }

    @SneakyThrows
    public Message(String text, User to,User from) {
        if(to.getIsBlocked()){
            throw new IllegalAccessException("Пользователь '" + to.getUsername()+"' заблокирован!");
        }else if(from.getIsBlocked()){
            throw new IllegalAccessException("Пользователь '" + from.getUsername()+"' заблокирован!");
        }
        String mess = translateService.translateEnToRus(text);
        this.text = textCheckService.checkBadWords(mess);
        this.to = to;
        this.from = from;
        this.timeStamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        String usernameTo,usernameFrom;

        try{
            usernameTo = to.getUsername();
        }catch (NullPointerException e){
            usernameTo = null;
        }
        try {
            usernameFrom = from.getUsername();
        }catch (NullPointerException e){
            usernameFrom = null;
        }
        return " Сообщение: '" + text + "'"
                +" Файл: '" + file + "'"
                +" От: '" + usernameFrom + "'"
                +" Кому: '" + usernameTo + "'"
                +" Время: '" + timeStamp + "'";
    }
}
