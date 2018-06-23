package com.cake.entity;


import java.sql.Timestamp;

public class UserInfo {

  private long id;
  private String username;
  private String password;
  private String identityCard;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp modifyTime;

  public UserInfo(Integer id, String username, String password, String identityCard, Timestamp createTime, Timestamp modifyTime) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.identityCard = identityCard;
    this.createTime = createTime;
    this.modifyTime = modifyTime;
  }

  public UserInfo(String username, String password, String identityCard) {
    this.username = username;
    this.password = password;
    this.identityCard = identityCard;
  }

  public UserInfo(String username, String password, String identityCard, Timestamp createTime, Timestamp modifyTime) {
    this.username = username;
    this.password = password;
    this.identityCard = identityCard;
    this.createTime = createTime;
    this.modifyTime = modifyTime;
    }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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
