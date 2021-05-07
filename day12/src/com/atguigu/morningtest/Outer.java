package com.atguigu.morningtest;

public class Outer {
    private int one;
    private static int two;

    public static class Inner{
        private int three;
        private static int four;

        public void methodOne(){
            // System.out.println(one); // 静态成员内部类只能访问外部类的静态成员
            System.out.println(two);
            System.out.println(three);
            System.out.println(four);
        }
    }
}
