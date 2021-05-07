package com.atguigu.test1;

public class TestThree {
    public static void main(String[] args) {
        String s1 ="One World One Dream!";
        int index = s1.indexOf("e");// 参数字符串在调用方法字符串中第一次出现的索引位置，如果未找到参数字符串则返回-1
        System.out.println(index);

        int index1 = s1.indexOf("e",index + 1);// 从第二个参数索引位置开始，检索第一个参数第一次出现的位置，找不到返回-1.
        System.out.println(index1);

        int index2 = s1.indexOf('e');// char型参数的搜索
        System.out.println(index2);
        int index3 = s1.indexOf(101);// int型参数的搜索
        System.out.println(index2);

        int index4 = s1.lastIndexOf("e");
        System.out.println(index4);

        String s5 = s1.intern();// 返回调用方法字符串串值的串池对象
        System.out.println(s1 == s5);

        String s6 = " 你  好 ";
        boolean flag= s6.isEmpty();// 返回调用方法字符串是否为空
        System.out.println(flag);

        int length = s6.length();// 返回字符串的字符数
        System.out.println(length);

        int length1 = s6.trim().length();// 去掉字符串两端的空格
        System.out.println(length1);

        String s7 = s1.replace('e','x');// 使用新的字符替换所有原来的老字符
        System.out.println(s7);

        System.out.println("-----------------------");
        String s8 = s1.replaceAll("One","Two");// 使用新的字符串替换所有原来的老字符串
        System.out.println(s8);

        String[] ss = s1.split(" ");// 使用参数作为分隔点，将原字符串分隔成一个数组
        System.out.println(ss.length);
        for (String s : ss) {
            System.out.println(s);
        }


        System.out.println("-----------");
        String s9 = s1.substring(9);// 从参数位置开始截取一直到字符串末尾
        System.out.println(s9);
        System.out.println("------------");


        String s10 = s1.substring(4,9);// 从第一个参数位置开始截取，截取到结束参数位置的前一位
        System.out.println(s10);
    }
}
