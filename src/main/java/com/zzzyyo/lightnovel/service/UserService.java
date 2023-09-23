package com.zzzyyo.lightnovel.service;

import com.zzzyyo.lightnovel.entity.User;

public interface UserService {

    /**
     * 登录方法
     * @param user
     * @return
     */
    public boolean loginUser(User user);


    boolean findUser(String username, String password);

    User login(User user);

    int addUser(User user);
}
