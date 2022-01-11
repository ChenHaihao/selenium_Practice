package com.example.seleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author 池恩
 * @date 2022/1/11 10:41
 * @project_name  携程网购票流程模拟（包含登录等操作）
 */

public class XieCheng {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ctrip.com/");
        driver.findElement(By.cssSelector("#nav_trains")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#label-departStation")).sendKeys("杭州");
        driver.findElement(By.cssSelector("#label-arriveStation")).sendKeys("温州");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#label-arriveStation")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div[2]/button")).click();
        Thread.sleep(500);
/*        driver.findElement(By.xpath("//*[@id=\"__next\"]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div")).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div")).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div")).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div")).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div")).sendKeys(Keys.PAGE_DOWN);*/
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"__next\"]/div")));
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"trainlistitem0\"]/div/button\n")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div[1]/section/div[2]/ul/li[1]/button\n")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"nloginname\"]\n")).sendKeys("17857337569");
        driver.findElement(By.xpath("//*[@id=\"npwd\"]\n")).sendKeys("haihao0724");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"normalview\"]/p/input\n")).click();
        driver.findElement(By.xpath("//*[@id=\"nsubmit\"]")).click();
        Thread.sleep(500);

        /*拖动验证条形验证码*/






        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div[1]/div[3]/div[2]/button")).click();
        driver.findElement(By.xpath("/html/body/div[12]/div/div[2]/div/div/div[2]/ul/li[1]/i[1]")).click();



    }
}
