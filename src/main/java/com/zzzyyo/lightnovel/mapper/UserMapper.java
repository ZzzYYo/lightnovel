package com.zzzyyo.lightnovel.mapper;

import com.zzzyyo.lightnovel.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper {

    /**
     * 登录方法
     * @param user
     * @return
     */
    public boolean loginUser(User user);


    boolean findUser(@Param("username") String username, @Param("password") String password);


    /**
     * 真的登录方法
     * @param user
     * @return
     */
    User login(User user);

    /**
     * 注册账号
     * @param user
     * @return
     */
    int addUser(User user);

}
