package com.company.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileNews extends News {
    public FileNews(String title, String content) {
        super(title, content); //super 要和父类的构造方法一致
    }

    public FileNews() {
        super();
    }

    //子类 自己的 方法
    public void read(String url) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(url)));
            title = reader.readLine(); //读取title
            reader.readLine(); //跳过空行
            content = reader.readLine(); //读取content
        } catch (java.io.IOException e) {
            System.out.println("新闻读取出错");
        }
    }

    //子类 重新实现 父类的 方法
    @Override
    public void display() {
        System.out.println(title + ":" + content);
    }
}
