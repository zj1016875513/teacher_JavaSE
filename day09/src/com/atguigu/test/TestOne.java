package com.atguigu.test;

public class TestOne {
    public static void main(String[] args) {
        //System.out.println(Father.four);
        // Father father = new Father();
        // 创建对象时的加载顺序，先静态，在普通，先父类再子类，先属性再代码块，最后构造方法
        Son son = new Son();

    }
}
