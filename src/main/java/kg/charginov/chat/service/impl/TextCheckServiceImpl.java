package kg.charginov.chat.service.impl;

import kg.charginov.chat.service.TextCheckService;

public class TextCheckServiceImpl implements TextCheckService {
    @Override
    public String checkBadWords(String message){
        StringBuilder sb = new StringBuilder();
        message = message.toLowerCase();
        for(String word:message.split(" ")){
            if(word.equals("бомж")){
                sb.append("****");
            }else{
                sb.append(word).append(" ");
            }
        }
        return sb.toString();
    }
}
