package com.company;

import com.company.model.Displayable;
import com.company.model.FileNews;
import com.company.model.News;
import com.company.model.Video;


public class Main {

    public static void main(String[] args) {
        News news = new News("abc", "父类");
        FileNews fileNews = new FileNews("abc", "子类");

        Video video = new Video();

        // 这其实就是 多态 。。。。
        viewNews(news);  // implements 接口
        viewNews(video); // implements 接口
        viewNews(fileNews);  // extends 继承
    }

    // 使用接口
    private static void viewNews(Displayable item) {
        item.display();
        System.out.println("播放完毕");
    }
}
