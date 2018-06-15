package com.cake.controller.weixin;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static org.junit.Assert.*;

/**
 * Created by XuRui's Hands.
 * User:XuRui
 * Date:2017/1/4
 * Time:17:33
 */
public class ConfigureTest {
    @Test
    public void getAccessToken() throws Exception {

        String token;
        String appid;
        String secret;

        Properties prop = new Properties();
        InputStream in = Object.class.getResourceAsStream("/weixin.properties");
        try {
            prop.load(in);
            token = prop.getProperty("weixin.token").trim();
            appid = prop.getProperty("weixin.appid").trim();
            secret = prop.getProperty("weixin.secret").trim();
            System.out.println(token+appid+secret);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}