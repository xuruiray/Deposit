package com.cake.controller;

import com.cake.dto.CardMainInfo;
import com.cake.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by XuRui's Hands.
 * User:XuRui
 * Date:2018/6/18
 * Time:23:05
 * Email:971661949@qq.com
 */
public class CardController {

    @Autowired
    private CardService cardService;

    @ResponseBody
    @RequestMapping("/getCardInfo")
    public CardMainInfo Register(@RequestParam(value = "amount", required = true) int amount) throws Exception{
        return cardService.loadCardRandom();
    }
}
