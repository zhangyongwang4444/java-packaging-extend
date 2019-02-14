package com.company.model;

public class FileNewsReader extends NewsReader {


    @Override
    public News readNews(String path) {
        super.readNews(path);
        //从文件读取，解析
        System.out.println("File reading ......");
        return null;
    }
}

