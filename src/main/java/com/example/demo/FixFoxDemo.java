package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FixFoxDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.baidu.com/");

        WebElement search_text = driver.findElement(By.id("kw"));
        WebElement search_button = driver.findElement(By.id("su"));
        WebElement daohanglan = driver.findElement(By.xpath("//*[@id=\"bottom_layer\"]"));

        System.out.println(daohanglan.getText());               //输出文本
        System.out.println(search_text.getSize());              //输出文本框大小

        search_text.sendKeys("你好");
        Thread.sleep(1000);
        search_text.clear();
        Thread.sleep(2000);
        search_text.sendKeys("周杰伦");
        Thread.sleep(1000);
        search_button.click();            //鼠标点击动作
        //search_text.submit();               //回车键

    }
}
