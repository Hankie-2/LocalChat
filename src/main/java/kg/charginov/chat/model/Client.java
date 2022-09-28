package kg.charginov.chat.model;

import kg.charginov.chat.model.enums.Role;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client extends User {

    public Client(Integer id, String username, String password, String imagePath) {
        super(id, username, password, imagePath, Role.USER);
    }

    public Client(Integer id, String username, String password) {
        super(id, username, password, null, Role.USER);
    }
}
