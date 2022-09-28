package kg.charginov.chat.service.impl;

import kg.charginov.chat.service.TranslateEnToRusService;

import java.util.HashMap;
import java.util.Map;

public class TranslateEnToRusServiceImpl implements TranslateEnToRusService {

    private HashMap<Integer,Character> en = new HashMap<>();
    private HashMap<Integer,Character> ru = new HashMap<>();

    @Override
    public String translateEnToRus(String message){
        StringBuilder sb = new StringBuilder();
        initEnMap();
        initRuMap();

        for(Character ch:message.toCharArray()){
            if(en.containsValue(ch)){
                for(Map.Entry<Integer,Character> entry:en.entrySet()){
                    if(entry.getValue()==ch){
                        int num = entry.getKey();
                        char c = ru.get(num);
                        sb.append(c);
                    }
                }
            }else{
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    private void initEnMap(){
        int ch = 'a';
        for(int i = 1;i<=26;i++){
            en.put(i, (char) ch++);
        }
        en.put(27,' ');
    }

    private void initRuMap(){
        ru.put(1,'а');
        ru.put(2,'б');
        ru.put(3,'к');
        ru.put(4,'д');
        ru.put(5,'е');
        ru.put(6,'ф');
        ru.put(7,'г');
        ru.put(8,'х');
        ru.put(9,'и');
        ru.put(10,'ж');
        ru.put(11,'к');
        ru.put(12,'л');
        ru.put(13,'м');
        ru.put(14,'н');
        ru.put(15,'о');
        ru.put(16,'п');
        ru.put(17,'к');
        ru.put(18,'р');
        ru.put(19,'с');
        ru.put(20,'т');
        ru.put(21,'ю');
        ru.put(22,'в');
        ru.put(23,'в');
        ru.put(24,'х');
        ru.put(25,'ы');
        ru.put(26,'з');
        ru.put(27,' ');
    }

}
