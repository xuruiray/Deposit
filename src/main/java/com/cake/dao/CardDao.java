package com.cake.dao;

import com.cake.dto.CardMainInfo;

/**
 * Created by XuRui's Hands.
 * User:XuRui
 * Date:2018/6/18
 * Time:23:07
 * Email:971661949@qq.com
 */
public interface CardDao {
    public CardMainInfo loadCardRandom() throws Exception;
}
