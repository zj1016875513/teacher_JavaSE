package com.atguigu.test;



public class TestTwo {
    public static void main(String[] args) {
        int i = 10;
        int j = 100;
        System.out.println("1");
        System.out.println(i);
        System.out.println(j);
        methodOne();
        j = 20;
        System.out.println(j);

    }

    public static void methodOne(){
        System.out.println("in static methodOne~~~~~~~~~~~~~~~~");
    }
}
