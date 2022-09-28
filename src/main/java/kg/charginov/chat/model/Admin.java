package kg.charginov.chat.model;

import kg.charginov.chat.model.enums.Role;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Admin extends User{

    public Admin(Integer id, String username, String password, String imagePath) {
        super(id, username, password, imagePath, Role.ADMIN);
    }
}
