package com.guoyasoft.signup;

/**
 * @program: aotu-test001
 * @description:
 * @author: guoya
 * @create: 2018-11-06 16:29
 **/
public class SignUpReq {
  //请求javabean
  private String phone;
  private String pwd;
  private String rePwd;
  private String userName;
  //右键Generate选择Getter and Setter
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public String getRePwd() {
    return rePwd;
  }

  public void setRePwd(String rePwd) {
    this.rePwd = rePwd;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
  //右键Generate选择toString
  @Override
  public String toString() {
    return "SignUpReq{" +
        "phone='" + phone + '\'' +
        ", pwd='" + pwd + '\'' +
        ", rePwd='" + rePwd + '\'' +
        ", userName='" + userName + '\'' +
        '}';
  }
}
