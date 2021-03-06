package com.company.model;

public class News implements Displayable {
    protected String title;
    protected String content;

    protected News() {

    }

    //构造的自由和责任交给用户！！
    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }


    //控制如何显示
    @Override
    public void display() {
        System.out.println(title + "\n" + content);
    }
}
