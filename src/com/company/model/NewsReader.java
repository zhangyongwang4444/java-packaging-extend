package com.company.model;

public abstract class NewsReader {


    private Integer x;


    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void test() {
    }


    public News readNews(String path) {
        System.out.println("来自父类");
        //模拟读取！！！
        return null;
    }

    ; //具有这个功能，但是具体的功能实现，在子类中确定！
}
