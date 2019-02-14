package com.company.model;

public class UrlNewsReader extends NewsReader {

    @Override
    public News readNews(String path) {
        super.readNews(path);
        //从网络读取，解析
        System.out.println("URL reading .........");
        return null;
    }
}

