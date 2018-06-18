package com.cake.entity;


public class CardInfo {

  private long id;
  private String bank;
  private String cardNumbers;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp modifyTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


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


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getModifyTime() {
    return modifyTime;
  }

  public void setModifyTime(java.sql.Timestamp modifyTime) {
    this.modifyTime = modifyTime;
  }

}
