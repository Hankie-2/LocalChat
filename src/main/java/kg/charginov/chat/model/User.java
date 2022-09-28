package kg.charginov.chat.model;

import kg.charginov.chat.model.enums.Role;
import kg.charginov.chat.service.impl.EncryptionServiceImpl;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class User {

    Integer id;

    String username;

    String password;

    String imagePath;

    Role role;

    Boolean isBlocked;

    Boolean isRegistered;

    private final EncryptionServiceImpl encryptionService = new EncryptionServiceImpl();

    public User(Integer id, String username, String password, String imagePath, Role role) {
        this.id = id;
        this.username = username;
        this.password = (encryptionService.encodePassword(password));
        this.imagePath = imagePath;
        this.role = role;
        this.isBlocked = false;
        this.isRegistered = false;
    }

    public User(Integer id, String username, String password, Role role) {
        this.id = id;
        this.username = username;
        this.password = (encryptionService.encodePassword(password));
        this.imagePath = null;
        this.role = role;
        this.isBlocked = false;
        this.isRegistered = false;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", role=" + role +
                ", isRegistered=" + isRegistered +
                '}';
    }
}