package com.guoyasoft.signup;

import com.guoyasoft.autoAPI.RespBase;

/**
 * @program: aotu-test001
 * @description:
 * @author: guoya
 * @create: 2018-11-06 16:31
 **/
public class SignUpResp {
  //响应javabean
  private RespBase respBase;
  private String userName;
  private int accoutId;
  private int cstId;
  private int userId;
  //右键Generate选择Getter and Setter
  public RespBase getRespBase() {
    return respBase;
  }

  public void setRespBase(RespBase respBase) {
    this.respBase = respBase;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public int getAccoutId() {
    return accoutId;
  }

  public void setAccoutId(int accoutId) {
    this.accoutId = accoutId;
  }

  public int getCstId() {
    return cstId;
  }

  public void setCstId(int cstId) {
    this.cstId = cstId;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }
  //右键Generate选择toString
  @Override
  public String toString() {
    return "SignUpResp{" +
        "respBase=" + respBase +
        ", userName='" + userName + '\'' +
        ", accoutId=" + accoutId +
        ", cstId=" + cstId +
        ", userId=" + userId +
        '}';
  }
}
