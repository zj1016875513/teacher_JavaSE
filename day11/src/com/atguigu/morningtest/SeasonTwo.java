package com.atguigu.morningtest;

// jdk1.5之后的枚举类
public enum SeasonTwo {
    // enum关键字声明的枚举类必须在第一部分声明本类的静态公开常量属性
    // 除属性名外其他全部省略
    SPRING("春"),SUMMER("夏"),AUTUMN("秋"),WINTER("冬");// 多个常量值间使用逗号隔开，所有常量值结束后，分号结束

    private String info;

    // 规定必须所有的构造方法都是private修饰
    private SeasonTwo(String info){
        this.info = info;
    }


    @Override
    public String toString() {
        return info;
    }
}
