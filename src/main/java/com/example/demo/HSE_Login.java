package com.example.demo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class HSE_Login {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://192.168.0.240/hseWeb/security/login");
        WebElement account = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        WebElement passworld = driver.findElement(By.xpath("//*[@id=\"userpwd\"]"));
        WebElement Vcode = driver.findElement(By.xpath("//*[@id=\"captcha\"]"));
        WebElement login = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
        account.sendKeys("admin");
        passworld.sendKeys("Cybstar@162394");
        Thread.sleep(2000);

        //public static String getcontent(String ImageFile){
        //    String content = "";
        //    File image = new File(ImageFile);
        //    ITesseract instance;
        //}

        //login.click();
    }
}
