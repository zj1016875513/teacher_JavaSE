package com.atguigu.enumdemo;

// 本类演示jdk1.5之前的枚举类
public class Season {

    // 类体中提供若干公开静态常量的该类对象作为属性
    public static final Season SPRING  = new Season("春");
    public static final Season SUMMER  = new Season("夏");
    public static final Season AUTUNM  = new Season("秋");
    public static final Season WINTER  = new Season("冬");

    private String info;

    // 私有化构造方法
    private Season(String info){
        this.info = info;
    }

    @Override
    public String toString() {
        return info;
    }
}
