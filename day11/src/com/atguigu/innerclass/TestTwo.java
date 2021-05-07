package com.atguigu.innerclass;

public class TestTwo {
    public static void main(String[] args) {
        // 普通成员内部类，在外部类以外的地方创建对象时，需要先创建外部类对象，再创建内部类对象
        // 创建外部类对象
        OuterTwo outerTwo = new OuterTwo();
        // 由外部类对象创建内部类对象
        OuterTwo.InnerTwo innerTwo = outerTwo.new InnerTwo();

        // 一句之内创建外部类对象同时创建内部类对象
        OuterTwo.InnerTwo innerTwo1 = new OuterTwo().new InnerTwo();

    }
}
