package kg.charginov.chat.service.impl;

import kg.charginov.chat.model.Client;
import kg.charginov.chat.service.ModeratorService;

public class ModeratorServiceImpl implements ModeratorService {

    @Override
    public void blockClient(Client client){
        client.setIsBlocked(true);
    }

}
