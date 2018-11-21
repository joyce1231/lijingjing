package com.guoyasoft.signup;

/**
 * @program: aotu-test001
 * @description:
 * @author: guoya
 * @create: 2018-11-06 16:32
 **/
public class RespBase {

  //响应请求的子项javabean，是respbase的子项
  private String respCode;
  private String respDesc;

  //右键Generate选择Getter and Setter
  public String getRespCode() {
    return respCode;
  }

  public void setRespCode(String respCode) {
    this.respCode = respCode;
  }

  public String getRespDesc() {
    return respDesc;
  }

  public void setRespDesc(String respDesc) {
    this.respDesc = respDesc;
  }
  //右键Generate选择toString
  @Override
  public String toString() {
    return "RespBase{" +
        "respCode='" + respCode + '\'' +
        ", respDesc='" + respDesc + '\'' +
        '}';
  }
}
