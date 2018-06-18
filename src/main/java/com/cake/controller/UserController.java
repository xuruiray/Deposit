package com.cake.controller;

import com.cake.entity.UserInfo;
import com.cake.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

/**
 * Created by XuRui's Hands.
 * User:XuRui
 * Date:2017/1/2
 * Time:20:18
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/login")
    public String Login(@RequestParam(value = "user_name", required = true) String userName,
                        @RequestParam(value = "password", required = true) String password) throws Exception{
        UserInfo userInfo = userService.loadUserByName(userName);
        if (userInfo.getPassword().equals(password)) {
            return UUID.randomUUID().toString();
        }else{
            return "false";
        }
    }

    @ResponseBody
    @RequestMapping("/register")
    public boolean Register(@RequestParam(value = "user_name", required = true) String userName,
                            @RequestParam(value = "password", required = true) String password) throws Exception {
        return userService.insertUser(userName, password);
    }

}
