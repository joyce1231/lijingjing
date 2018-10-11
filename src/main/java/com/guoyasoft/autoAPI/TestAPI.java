package com.guoyasoft.autoAPI;

import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAPI {
    @Test
    public void testGetAllAccount(){
      String result=HttpClientUtil.doGet("http://qa.guoyasoft.com:8080/account/get?accountName=xiaoxiao1");
      System.out.println(result);
      boolean actual=result.contains("xiaoxiao1");
      Assert.assertEquals(actual, true);
    }

    @Test
    public void testAddAccount(){
      String url="http://qa.guoyasoft.com:8080/account/add";
      Map map=new HashMap<>();
      map.put("accountName", "asdf000");
      map.put("customerName", "陈超");
      String result=HttpClientUtil.doPost(url, map);
      System.out.println(result);
      boolean actual=result.contains("0000");
      Assert.assertEquals(actual, true);
    }
}
