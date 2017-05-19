package xmu.lgp.pms.manager.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import xmu.lgp.pms.manager.UserManager;
import xmu.lgp.pms.service.UserService;

@Service
public class UserManagerImpl implements UserManager {

    @Resource
    UserService userService;
    
    @Override
    public String getUserName(String userId) {
        return userService.getUserName(userId);
    }

}
