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

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

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


    @RequestMapping("/deposit")
    public String Deposit() {
        return "bankInfo";
    }

    @ResponseBody
    @RequestMapping("/getCardInfo")
    public String loadCardRandom(HttpServletRequest request,
                                 @RequestParam(value = "card_id", required = true) String cardID,
                                 @RequestParam(value = "amount", required = true) String amount) throws Exception {

        String sessionID = "";
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            return "{\"bank\": \"\",\"card_numbers\": \"\"}";
        }
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("session_id")) {
                sessionID = cookie.getValue();
            }
            break;
        }

        ShardedJedis jedis = jedisPool.getResource();
        String result = jedis.get(sessionID);
        jedis.close();
        if (result != null) {
            CardMainInfo cardMainInfo = cardService.loadCardRandom();
            return "{\"bank\": \"" + cardMainInfo.getBank() + "\",\"card_numbers\": \"" + cardMainInfo.getCard_numbers() + "\"}";
        } else {
            return "{\"bank\": \"\",\"card_numbers\": \"\"}";
        }
    }
}
