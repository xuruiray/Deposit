package com.cake.dao;

import com.cake.entity.User;

import java.util.List;

/**
 * Created by XuRui's Hands.
 * User:XuRui
 * Date:2016/12/31
 * Time:16:15
 */
public interface UserDao {
    List<User> loadAllUser() throws Exception;

    User loadUserById(int userId) throws Exception;

    void deleteUserById(int userId) throws Exception;
}
