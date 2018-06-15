package com.cake.service.impl;

import com.cake.dao.UserDao;
import com.cake.entity.User;
import com.cake.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Created by XuRui's Hands.
 * User:XuRui
 * Date:2017/1/1
 * Time:21:35
 */

@Service
public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
        System.out.println("初始化业务");
    }

    @Autowired
    private UserDao userDao;

    @Transactional
    public List<User> loadAllUser() throws Exception {
        return userDao.loadAllUser();
    }

    @Transactional
    public User loadUserById(int userId) throws Exception {
        return userDao.loadUserById(userId);
    }

    @Transactional
    public void deleteUserById(int userId) throws Exception {
        userDao.deleteUserById(userId);
    }
}
