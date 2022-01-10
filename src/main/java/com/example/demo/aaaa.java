package com.example.demo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class aaaa {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver =new FirefoxDriver();
        System.out.println("打开浏览器----------------");
        webDriver.manage().window().maximize();
        System.out.println("页面最大化-----------------");
        //全局隐式等待，等待
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //设定网址
        webDriver.get("http://192.168.0.240/hseWeb/security/login");
        //显示等待控制对象
        WebDriverWait webDriverWait=new WebDriverWait(webDriver,5);
        //输入用户名 密码
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("name"))).sendKeys("用户名");
        System.out.println("输入用户名-----------------------");
        //另外一种获取元素方法
        WebElement e= webDriver.findElement(By.id("pwd"));

        e.clear();

        System.out.println("清空密码框内容----------------------");

        e.sendKeys("你的pwd");

        System.out.println("输入密码--------------------------");

        Thread.sleep(3000);//线程等待验证码图片加载

        WebElement ele = webDriver.findElement(By.id("imgCaptcha"));

        File screenshot = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);

        BufferedImage fullImg =null;

        try {

            fullImg = ImageIO.read(screenshot);

        }catch (IOException e1) {

            e1.printStackTrace();

        }

        Point point = ele.getLocation();
        //getSubimage（）定位元素   x轴位置  y轴位置  宽  高  定位到验证码图片
        BufferedImage eleScreenshot= fullImg.getSubimage(point.getX()+110, point.getY(),120, 48);
        try {
            ImageIO.write(eleScreenshot, "jpg", screenshot);
        }catch (IOException e1) {
            e1.printStackTrace();
        }
//替换文件夹内图片
        File screenshotLocation =new File("C:\\Users\\Administrator\\Desktop\\png\\test.jpg");
        try {
            FileUtils.copyFile(screenshot, screenshotLocation);
        }catch (IOException e1) {
            e1.printStackTrace();
        }
        System.out.println("获取登录按钮-------------------------------------");
        WebElement e1= webDriver.findElement(By.id("loginbtn"));

        e1.click();

//至此登录成功

//切换页面点击

        webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div/span[2]/ul/li[1]/div/a")).click();
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        System.out.println("切换页面-------------------------------");
        // 得到当前窗口的set集合
        Set winHandels = webDriver.getWindowHandles();
        // 将set集合存入list对象
        List it =new ArrayList(winHandels);
        // 切换到弹出的新窗口
        webDriver.switchTo().window((String) it.get(1));
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        String uri=webDriver.getCurrentUrl(); //获取新窗口的url
        System.out.println("新窗口url"+uri+"----------------------------");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        webDriver.findElement(By.id("0007")).click();
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        webDriver.findElement(By.id("10000181")).click();
        //定位frame中元素
        String text= webDriver.switchTo().frame("bodyIframe").findElement(By.xpath("//*[@id=\"form1\"]/table/tbody/tr[1]/td[1]")).getText();
        webDriver.close();

    }
}
