package xmu.lgp.pms.service.impl;

import org.springframework.stereotype.Service;

import xmu.lgp.pms.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUserName(String userId) {
        // TODO 
        return "Lgp-" + userId;
    }

}
