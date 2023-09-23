package com.zzzyyo.lightnovel.service.impl;

import com.zzzyyo.lightnovel.entity.User;
import com.zzzyyo.lightnovel.mapper.UserMapper;
import com.zzzyyo.lightnovel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    // com.zzzyyo.lightnove.entity.User不能强制转换为java.lang.Boolean
    @Override
    public boolean loginUser(User user) {
        return false;
    }

    // com.zzzyyo.lightnove.entity.User不能强制转换为java.lang.Boolean
    @Override
    public boolean findUser(String username, String password) {
        return false;
    }

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }


}
