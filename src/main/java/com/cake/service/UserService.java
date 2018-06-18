package com.cake.service;

import com.cake.entity.UserInfo;

/**
 * Created by XuRui's Hands.
 * User:XuRui
 * Date:2017/1/1
 * Time:21:36
 */
public interface UserService {
   public UserInfo loadUserByName(String userName) throws Exception;
}
