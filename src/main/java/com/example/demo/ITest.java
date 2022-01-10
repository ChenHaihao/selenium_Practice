package com.example.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ITest {

    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "F:/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");
        driver.close();
    }
}