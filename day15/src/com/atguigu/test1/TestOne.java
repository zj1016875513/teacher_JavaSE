package com.atguigu.test1;

public class TestOne {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";

        System.out.println(s1 == s2);

        String s3 = "hello";
        String s4 = new String("hello");

        System.out.println(s3 == s4);

        String s5 = new String("hello");
        String s6 = new String("hello");

        System.out.println(s5 == s6);
    }
}
