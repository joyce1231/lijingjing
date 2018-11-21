package com.guoyasoft.autoUI.firstDemo;

import com.guoyasoft.autoUI.common.BaseUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class MyUITest extends BaseUI {
  @Test
  public void testLogin(){
    //打开网页
    driver.get("https://www.baidu.com/");
    sleep(1000);
    //使用导航栏操作打开网页
    driver.navigate().to("https://www.jianshu.com/");
    sleep(1000);
    //后退
    driver.navigate().back();
    sleep(1000);
    //前进
    driver.navigate().forward();
    sleep(1000);
    //刷新
    driver.navigate().refresh();
    sleep(1000);
  }
  @Test
  public void testTest(){
    driver.get("http://127.0.0.1:8081/lijingjing/testdemo.html");
    sleep(1000);
    WebElement text = driver.findElement(By.id("edit"));
    text.clear();
    text.sendKeys("傻不傻？傻！");
    sleep(1000);
  }
  @Test
  public void testFile(){
    driver.get("http://127.0.0.1:8081/lijingjing/testdemo.html");
    sleep(1000);
    WebElement file = driver.findElement(By.name("attach[]"));
    file.sendKeys("D:\\haah.txt");
    sleep(1000);
  }
  @Test
  public void textRadio(){
    driver.get("http://127.0.0.1:8081/lijingjing/testdemo.html");
    sleep(1000);
    List<WebElement> radios = driver.findElements(By.name("company"));
    for (int i = 0 ; i < radios.size();i++){
    radios.get(i).clear();
    sleep(1000);
    }
  }
  @Test
  public void testChenkBox(){
    driver.get("http://127.0.0.1:8081/lijingjing/testdemo.html");
    sleep(1000);
    List<WebElement> ChenkBox = driver.findElements(By.name("course"));
    for (int i = 0 ; i < ChenkBox.size();i++){
      ChenkBox.get(i).clear();
      sleep(1000);
    }
  }
  @Test
  public void testChe(){
    driver.get("http://127.0.0.1:8081/lijingjing/testdemo.html");
    sleep(1000);
    List<WebElement> Che = driver.findElements(By.name("course"));
    for (WebElement C:Che){
        C.click( );
        sleep(1000);
    }
  }
  @Test
  public void testDate(){

  }
}
