package com.atguigu.test2;

public class News {
    private String title;
    private String author;
    private String content;

    public News() {
    }

    public News(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
