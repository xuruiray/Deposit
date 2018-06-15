package com.cake.service;

import com.cake.entity.User;

import java.util.List;

/**
 * Created by XuRui's Hands.
 * User:XuRui
 * Date:2017/1/1
 * Time:21:36
 */
public interface UserService {
    List<User> loadAllUser() throws Exception;

    User loadUserById(int userId) throws Exception;

    void deleteUserById(int userId) throws Exception;
}
