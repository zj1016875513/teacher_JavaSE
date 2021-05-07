package com.atguigu.entity;

public class TestOne {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        methodOne();
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
    }

    public static void methodOne(){
        System.out.println(4);
        methodTwo();
        System.out.println(6);
    }

    public static void methodTwo(){
        System.out.println(5);

    }

}
