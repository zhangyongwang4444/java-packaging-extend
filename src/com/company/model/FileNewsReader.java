package com.company.model;

public class FileNewsReader extends NewsReader {
    public FileNewsReader(Integer x) {
        super(x);
    }

    @Override
    public News readNews(String path) {
        //从文件读取，解析
        return new News("abc", "test");
    }
}

