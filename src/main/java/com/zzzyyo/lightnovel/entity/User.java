package com.zzzyyo.lightnovel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * 用户实体类
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    /**
     * 用户id
     */
    private Integer userid;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 头像
     */
    private String userimg;
    /**
     * 注册时间
     */
    private Timestamp usertime;
    /**
     * 等级
     */
    private Integer level;
    /**
     * 收藏夹id
     */
    private Integer favoriteid;
    /**
     * 评论id
     */
    private Integer commentid;

}
