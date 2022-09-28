package kg.charginov.chat.model;

import kg.charginov.chat.model.enums.Role;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Moderator extends User{

    public Moderator(Integer id, String username, String password, String imagePath) {
        super(id, username, password, imagePath, Role.MODERATOR);
    }

    public Moderator(Integer id, String username, String password) {
        super(id, username, password, Role.MODERATOR);
    }

}
