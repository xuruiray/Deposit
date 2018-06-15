package com.cake.service.impl;

import com.cake.BaseTest;
import com.cake.service.UserService;
import org.junit.Test;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by XuRui's Hands.
 * User:XuRui
 * Date:2017/1/1
 * Time:21:42
 */


public class UserServiceImplTest extends BaseTest{

    @Resource
    public UserService userService;

    @Test
    public void loadAllUser() throws Exception {
        List<User> list = userService.loadAllUser();
        if(list!=null) {
            for (User u : list) {
                System.out.println(u);
            }
        }
        else{
            System.out.println("列表为空");
        }
    }

    @Test
    public void loadUserById() throws Exception {
        System.out.println(userService.loadUserById(25));
    }

    @Test
    public void deleteUserById() throws Exception {
        userService.deleteUserById(25);
    }

}