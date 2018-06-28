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
    private String cardNumbers;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCardNumbers() {
        return cardNumbers;
    }

    public void setCardNumbers(String cardNumbers) {
        this.cardNumbers = cardNumbers;
    }

    @Override
    public String toString() {
        return "CardMainInfo{" +
                "bank='" + bank + '\'' +
                ", cardNumbers='" + cardNumbers + '\'' +
                '}';
    }
}
