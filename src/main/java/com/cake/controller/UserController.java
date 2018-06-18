package com.cake.controller;

import com.cake.entity.UserInfo;
import com.cake.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
        if (userInfo.getPassword() == password){
            return "true";
        }else{
            return "false";
        }
    }

    @ResponseBody
    @RequestMapping("/register")
    public String Register(@RequestParam(value = "user_name", required = true) int UserName,
                           @RequestParam(value = "password", required = true) int Password) throws Exception{
        return "hello";
    }

}
