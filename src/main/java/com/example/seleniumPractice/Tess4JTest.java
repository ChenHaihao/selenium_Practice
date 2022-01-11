package com.example.seleniumPractice;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;
import java.io.IOException;

/**
 * @author 池恩
 * @date 2022/1/11 15:01
 * @project_name    Tess4JTest练习
 */
public class Tess4JTest {
    public static void main(String[] args) {
        String path = "F:\\JDemo\\demo";                                    //项目根目录
        File file = new File(path + "\\testphoto3.jpg");
        ITesseract instance = new Tesseract();
        /*
        * 获取项目根目录路径
        * */
        File directory = new File(path);
        String courseFile = null;
        try {
            courseFile = directory.getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        *  设置训练库位置
        * */
        instance.setDatapath(courseFile+"\\tessdata");

        instance.setLanguage("eng");            //设置语言格式为中文
        String result = null;
        try {
            long startTime = System.currentTimeMillis();
            result = instance.doOCR(file);
            long endTime = System.currentTimeMillis();
            System.out.println("识别耗时:"+(endTime - startTime)+"毫秒");
        } catch (TesseractException e) {
            e.printStackTrace();
        }
        System.out.println("识别结果: ");
        System.out.println(result);

    }
}


