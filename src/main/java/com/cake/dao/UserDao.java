package com.cake.dao;

import com.cake.entity.UserInfo;

/**
 * Created by XuRui's Hands.
 * User:XuRui
 * Date:2016/12/31
 * Time:16:15
 */
public interface UserDao {
    UserInfo loadUserByName(String userName) throws Exception;

    int insertUser(UserInfo userInfo) throws Exception;
}
