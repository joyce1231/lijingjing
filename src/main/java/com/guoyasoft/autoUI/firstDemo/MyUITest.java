package com.guoyasoft.autoUI.firstDemo;

import com.guoyasoft.autoUI.common.BaseUI;
import org.testng.annotations.Test;

public class MyUITest extends BaseUI {
  @Test
  public void testLogin(){
    driver.get("http://pro.guoyasoft.com:8080/guoya-medium/jsp/user/login.jsp");
    sleep(1000);
  }
}
