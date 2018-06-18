package com.cake.service.impl;

import com.cake.dao.CardDao;
import com.cake.dto.CardMainInfo;
import com.cake.entity.CardInfo;
import com.cake.service.CardService;
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
public class CardServiceImpl implements CardService {

    @Autowired
    private CardDao cardDao;

    @Transactional
    public CardMainInfo loadCardRandom() throws Exception {
        return cardDao.loadCardRandom();
    }

}
