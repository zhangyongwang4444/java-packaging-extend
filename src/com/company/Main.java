package com.company;

import com.company.model.FileNews;
import com.company.model.News;

public class Main {

    public static void main(String[] args) {
        News news = new News("abc", "父类");
        System.out.println(news.dispaly());

        FileNews fileNews = new FileNews("abc", "子类");
        System.out.println(fileNews.dispaly());
    }
}
