package com.company;

import com.company.model.*;


public class Main {

    public static void main(String[] args) {
        News news = new News("abc", "父类");
        FileNews fileNews = new FileNews("abc", "子类");

        Video video = new Video();

        News new1 = read(new UrlNewsReader(), "path_sample");  //抽象类
        News new2 = read(new FileNewsReader(), "path_sample2"); //抽象类

        NewsReader newsReader = new UrlNewsReader();
        newsReader.readNews("path_simple");
        // 这其实就是 多态 。。。。
//        viewNews(news);  // implements 接口
//        viewNews(video); // implements 接口
//        viewNews(fileNews);  // extends 继承
    }

    //使用 继承 抽象类 简化代码！！！
    private static News read(NewsReader reader, String path) {
        return reader.readNews(path);
    }

    /////////////////////////////////////////////////////////
//    private static News read(UrlNewsReader reader, String path) {
//        return reader.readNews(path);
//    }
//
//    private static News read(FileNewsReader reader, String path) {
//        return reader.readNews(path);
//    }
    ///////////////////////////////////////////////////////////////


    // 使用 接口 简化代码！！！
    private static void viewNews(Displayable item) {
        item.display();
        System.out.println("news播放完毕");
    }

    //////////////////////////////////////////////////////////
//    private static void viewVodeo(Video video) {
//        video.display();
//        System.out.println("video播放完毕");
//    }
//
//    private static void viewLecture(Lecture lecture) {
//        lecture.display();
//        System.out.println("lecture播放完毕");
//    }
    ///////////////////////////////////////////////////////////
}
