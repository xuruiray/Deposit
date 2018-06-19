package com.cake.controller;

import com.cake.dto.CardMainInfo;
import com.cake.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

/**
 * Created by XuRui's Hands.
 * User:XuRui
 * Date:2018/6/18
 * Time:23:05
 * Email:971661949@qq.com
 */

@Controller
@RequestMapping("/card")
public class CardController {

    @Autowired
    private CardService cardService;
    @Autowired
    private ShardedJedisPool jedisPool;

    @ResponseBody
    @RequestMapping("/getCardInfo")
    public CardMainInfo loadCardRandom(@RequestParam(value = "session_id", required = true) String sessionID) throws Exception {
        ShardedJedis jedis = jedisPool.getResource();
        String result = jedis.get(sessionID);
        jedis.close();

        if (result.equals("1")) {
            return cardService.loadCardRandom();
        } else {
            //TODO 跳转登录页面
            return null;
        }
    }
}
