package com.guoyasoft.signup;

import com.alibaba.fastjson.JSON;

import com.guoyasoft.autoAPI.HttpClientUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @program: aotu-test001
 * @description:
 * @author: guoya
 * @create: 2018-11-06 16:35
 **/
public class SignUpTest {

  @Test
  public void signUpTest() {
    //new请求javabean给javabean设值
    SignUpReq signUpReq = new SignUpReq();
    signUpReq.setPhone("18818140555");
    signUpReq.setPwd("w132465");
    signUpReq.setRePwd("w132465");
    signUpReq.setUserName("string987");
    //将请求javabean转换成json并保存在变量中
    String reqjson = JSON.toJSONString(signUpReq, true);
    System.out.println("-------------------请求报文：-------------------");
    System.out.println(reqjson);
    //将url放入变量中
    String url = "http://qa.guoyasoft.com:8080/user/signup";
    //使用dopostbyjson方法发送请求并接收响应
    String result = HttpClientUtils.doPostByJson(url, reqjson, "UTF-8");
    System.out.println("-------------------响应报文：------------");
    System.out.println(result);
    //将响应转换成javabean并保存在变量中
    SignUpResp signUpResp = JSON.parseObject(result, SignUpResp.class);
    //断言
    Assert.assertEquals(signUpResp.getRespBase().getRespCode(), "9999");
    System.out.println("--------------------响应码：----------------");
    System.out.println(signUpResp.getRespBase().getRespCode());
  }
}
