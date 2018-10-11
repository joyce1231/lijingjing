package com.guoyasoft.autoAPI;

import java.util.HashMap;
import java.util.Map;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAPI {

  @Test
  public void testGetAllAccount() {
    String result = HttpClientUtil.doGet("http://qa.guoyasoft.com:8080/account/get?accountName=xiaoxiao1");
    System.out.println(result);
    boolean actual = result.contains("xiaoxiao1");
    Assert.assertEquals(actual, true);
  }

  @Test
  public void testAddAccount() {
    String url = "http://qa.guoyasoft.com:8080/account/add";
    Map map = new HashMap<>();
    map.put("accountName", "asdf0007");
    map.put("customerName", "陈超");
    String result = HttpClientUtil.doPost(url, map);
    System.out.println(result);
    boolean actual = result.contains("\"respCode\":\"0000\"");
    Assert.assertEquals(actual, true);
  }

  @Test
  public void testRecharge(){
    String url="http://qa.guoyasoft.com:8080/accountBill/recharge";
    String body="{\n"
        + "  \"accountName\": \"asdf0007\",\n"
        + "  \"busiDesc\": \"string\",\n"
        + "  \"changeMoney\": 10,\n"
        + "  \"mark\": \"string\",\n"
        + "  \"operator\": \"string\"\n"
        + "}";
    String result=HttpClientUtil.doPost(url, "application/json",body);
    System.out.println(result);
    boolean actual=result.contains("\"respCode\":\"0000\"");
    Assert.assertEquals(actual, true);
  }

}
