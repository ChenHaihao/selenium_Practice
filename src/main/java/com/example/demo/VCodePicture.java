package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
public class VCodePicture {
    public static void main(String[] args) throws AWTException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://192.168.0.240/hseWeb/security/login");
        WebElement Vcode = driver.findElement(By.xpath("//*[@id=\"captcha\"]"));
        WebElement Picture = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/dd/dl[3]/div/div/img"));
        Actions actions = new Actions(driver);
        actions.contextClick(Picture).build().perform();
        //actions.contextClick(Picture);
        //Robot robot = new Robot();
        //robot.keyPress(KeyEvent.VK_PAGE_DOWN);

    }
}
