package com.company.model;

public class FileNewsReader extends NewsReader {


    @Override
    public News readNews(String path) {
        //从文件读取，解析
        return new News("abc", "test");
    }
}

