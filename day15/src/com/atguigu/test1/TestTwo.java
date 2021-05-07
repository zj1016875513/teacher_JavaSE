package com.atguigu.test1;

import java.io.UnsupportedEncodingException;

public class TestTwo {
    public static void main(String[] args) {
        String s1 = "hello";
        char c = s1.charAt(2);// 将调用方法字符串中参数索引位置的字符返回
        System.out.println(c);

        String s2 = " world";
        s1 = s1.concat(s2);// 拼接字符串
        System.out.println(s1);

        String s3 = "Hello world";
        boolean flag = s3.contains("ello");// 检索调用方法字符串中是否包含参数串内容
        System.out.println(flag);

        boolean flag1 = s3.endsWith("rld");// 调用方法的字符串是否已参数字符串结尾
        System.out.println(flag1);
        boolean flag2 = s3.startsWith("Hello");// 调用方法的字符串是否已参数字符串开头
        System.out.println(flag2);

        String s4 = new String("Nihao");
        String s5 = new String("nihao");
        boolean flag3 = s4.equals(s5);// 考虑大小写的判断两个字符串串值是否相等
        System.out.println(flag3);

        boolean flag4 = s4.equalsIgnoreCase(s5);// 忽略小写的判断两个字符串串值是否相等
        System.out.println(flag4);

        boolean flag5 = s4.toUpperCase().equals(s5.toUpperCase());
        System.out.println(flag5);

        String s6 = "同一个世界，同一个梦";

        byte[] data1 = s6.getBytes();// 将一个字符串拆分成一个byte型数组
        try {
            byte[] data2 = s6.getBytes("utf-8");// 将一个字符串按照固定的编码格式拆分成一个byte数组
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(data1.length);

        char[] data3 = s6.toCharArray();// 将一个字符串拆分成char型数组
        System.out.println(data3.length);
    }
}
