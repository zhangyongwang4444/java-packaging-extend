package com.company.model;

public class UrlNewsReader extends NewsReader {

    @Override
    public News readNews(String path) {
        //从网络读取，解析
        return new News("abc", "test");
    }
}
