package com.cake.dto;

/**
 * Created by XuRui's Hands.
 * User:XuRui
 * Date:2018/6/18
 * Time:23:19
 * Email:971661949@qq.com
 */
public class CardMainInfo {
    private String bank;
    private String card_numbers;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCard_numbers() {
        return card_numbers;
    }

    public void setCard_numbers(String card_numbers) {
        this.card_numbers = card_numbers;
    }

    @Override
    public String toString() {
        return "CardMainInfo{" +
                "bank='" + bank + '\'' +
                ", card_numbers='" + card_numbers + '\'' +
                '}';
    }
}
