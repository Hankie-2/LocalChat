package kg.charginov.chat.service.impl;

import kg.charginov.chat.model.User;
import kg.charginov.chat.service.EncryptionService;

import java.util.Base64;

public class EncryptionServiceImpl implements EncryptionService {

    @Override
    public String encodePassword(String password){
        Base64.Encoder encoder = Base64.getEncoder();


        return encoder.encodeToString(password.getBytes());
    }

    @Override
    public String decodePassword(User user){
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] bytes = decoder.decode(user.getPassword());

        return new String(bytes);
    }

}
