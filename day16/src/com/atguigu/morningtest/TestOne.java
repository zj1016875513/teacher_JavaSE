package com.atguigu.morningtest;

import java.io.UnsupportedEncodingException;

public class TestOne {
    public static void main(String[] args) {
        String word = new String("hello");

        System.out.println(word.length());// 返回当前String的字符数，包含两端及中间的空格
        System.out.println(word.concat(" world"));// 拼接两个字符串，拼接后产生第三个字符串
        System.out.println(word.equals("hello"));// 考虑大小写的比较两个字符串是否相等。
        System.out.println(word.equalsIgnoreCase("HELLO"));// 忽略大小写的比较两个字符串值是否相等
        System.out.println(word.toUpperCase());// 将原串全部字符转成大写字母
        System.out.println(word.toLowerCase());// 将原串全部转字符成小子字母
        byte[] bs = word.getBytes();// 将字符串拆分成字节数组
        try {
            byte[] bs1 = word.getBytes("utf-8");// 将原串按照某个特定的编码规则拆分成字节数组
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        char[] cs = word.toCharArray();// 将原串拆分成字符数组
        System.out.println(word.indexOf("ell"));// 在原串中搜索目标字符串第一次出现的索引
        System.out.println(word.indexOf("ell", 3));// 从第二个参数索引位置开始，在原串中搜索第一个参数的第一次出现的位置。
        word.lastIndexOf("ell");// 在原串中搜索参数字符串最后一次出现的索引位置
        word.lastIndexOf("ell",3);// 从第二个参数索引位置开始在原串中搜索第一个参数最后一次出现的索引位置
        System.out.println(word.charAt(3));// 在原串中，返回参数索引位置的字符
        System.out.println(word.substring(2));// 从参数索引位置开始，截取到字符串末尾
        System.out.println(word.substring(2, 4));// 从第一个参数索引位置开始，截取到第二个参数索引位置的前一位。
        System.out.println(word.replace('l', 'w'));// 使用新的字符替换所有老的字符
        word.replaceAll("w","l");// 使用支持正则表达式的字符串，新串替换所有的老串
        word.replaceFirst("w","l");// 使用支持正则表达式的字符串，用新串替换第一个出现的老串
        String[] words = word.split(" ");// 使用支持正则表达式的字符串做参数，将原串分割成一个字符串数组
    }
}
