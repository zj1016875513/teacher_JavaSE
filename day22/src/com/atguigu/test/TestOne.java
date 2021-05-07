package com.atguigu.test;

public class TestOne {
    public static void main(String[] args) {
        // 匿名内部类实现接口，创建对象调用方法
        MyInterOne mio = new MyInterOne() {
            @Override
            public void methodOne() {
                System.out.println("in MyInterOne methodOne~~~~~~~~~~~~");
            }


        };
        mio.methodOne();
        System.out.println("-----------------------------------");
        // lamdba表达式，用于实现接口，仅能用于实现单个方法的接口
        MyInterOne mio1 = () -> System.out.println("in MyInterOne methodOne===================");
        mio1.methodOne();

    }
}

// 只有一个方法的接口被称作函数式接口
@FunctionalInterface
interface MyInterOne{
    public void methodOne();
}