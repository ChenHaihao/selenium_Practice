package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IITest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://news.baidu.com/");
        driver.manage().window().maximize();            //窗口最大化
        //driver.manage().window().setSize(new Dimension(800,800));
        //driver.findElement(By.id("su"));
        driver.findElement(By.linkText("图片")).click();
        Thread.sleep(2000);

        driver.navigate().back();               //网页后退
        System.out.printf("当前网址：",driver.getCurrentUrl());
        Thread.sleep(2000);

        driver.navigate().forward();            //网页前进
        System.out.printf("当前网址：",driver.getCurrentUrl());
        Thread.sleep(3000);

        driver.navigate().refresh();            //F5刷新网页

        driver.quit();
        //driver.close();
    }
}
