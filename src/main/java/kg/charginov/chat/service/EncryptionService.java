package kg.charginov.chat.service;

import kg.charginov.chat.model.User;

public interface EncryptionService {

    public String encodePassword(String password);
    public String decodePassword(User user);

}
