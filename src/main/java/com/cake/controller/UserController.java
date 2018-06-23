package com.cake.controller;

import com.cake.entity.UserInfo;
import com.cake.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

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
    @Autowired
    private ShardedJedisPool jedisPool;

    @ResponseBody
    @RequestMapping("/login")
    public String Login(@RequestParam(value = "user_name", required = true) String userName,
                        @RequestParam(value = "password", required = true) String password) throws Exception{
        UserInfo userInfo = userService.loadUserByName(userName);
        String uuid = UUID.randomUUID().toString();

        ShardedJedis jedis = jedisPool.getResource();
        jedis.set(uuid, "1");
        jedis.expire(uuid, 300);
        jedis.close();

        if (userInfo.getPassword().equals(password)) {
            return "{\"session_id\":\"" + uuid + "\"}";
        }else{
            return "{\"msg\":\"" + "false" + "\"}";
        }
    }

    @ResponseBody
    @RequestMapping("/register")
    public String Register(@RequestParam(value = "user_name", required = true) String userName,
                           @RequestParam(value = "password", required = true) String password,
                           @RequestParam(value = "identity_card", required = true) String identityCard) throws Exception {
        try {
            if (userService.insertUser(userName, password, identityCard)) {
                return "{\"msg\":\"" + "succeed" + "\"}";
            } else {
                return "{\"msg\":\"" + "failed" + "\"}";
            }
        } catch (DuplicateKeyException e) {
            return "{\"msg\":\"" + "duplicate user_name" + "\"}";
        }
    }

}
