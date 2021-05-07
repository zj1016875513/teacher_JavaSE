package com.atguigu.morningtest;

// jdk1.5之前的枚举
public class SeasonOne {
    // 公开静态常量的本类属性
    public static final SeasonOne SPRING = new SeasonOne("春");
    public static final SeasonOne SUMMER = new SeasonOne("夏");
    public static final SeasonOne AUTUMN = new SeasonOne("秋");
    public static final SeasonOne WINTER = new SeasonOne("冬");

    private String info;

    // 构造方法私有
    private SeasonOne(String info){
        this.info = info;
    }

    @Override
    public String toString() {
        return info;
    }
}
