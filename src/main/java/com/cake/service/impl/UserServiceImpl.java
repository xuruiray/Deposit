package com.cake.service.impl;

import com.cake.dao.UserDao;
import com.cake.entity.UserInfo;
import com.cake.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by XuRui's Hands.
 * User:XuRui
 * Date:2017/1/1
 * Time:21:35
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public UserInfo loadUserByName(String userName) throws Exception {
        return userDao.loadUserByName(userName);
    }

}
