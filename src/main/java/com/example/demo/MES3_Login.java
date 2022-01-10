package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MES3_Login {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://192.168.0.205:8080/#/login");

        WebElement mesaccount = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        WebElement mespassword = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        WebElement meslogin = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/form/div[3]/div/div/span/button"));
        mesaccount.sendKeys("admin");
        Thread.sleep(2000);
        mespassword.sendKeys("Cybstar@2021");
        Thread.sleep(2000);
        meslogin.click();

        //driver.quit();
    }
}
