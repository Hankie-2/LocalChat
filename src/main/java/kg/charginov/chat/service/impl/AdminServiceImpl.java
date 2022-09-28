package kg.charginov.chat.service.impl;

import kg.charginov.chat.model.User;
import kg.charginov.chat.service.AdminService;

public class AdminServiceImpl implements AdminService {

    @Override
    public void blockUser(User user){
        user.setIsBlocked(true);
    }

}
