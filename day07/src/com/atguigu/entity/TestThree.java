package com.atguigu.entity;

public class TestThree {
    public static void main(String[] args) {
        methodOne(10,5.5,"hello","good","ok","baibai");
    }

    // 变长参数组,同种类型的参数可以不传，也可以传任意数量个参数
    // 任何一个方法，变长参数组只能有一个
    // 变长参数组必须在参数列表的最后
    public static void methodOne(int one,double two,String... words){

        for(int i = 0;i < words.length; i++){
            System.out.println(words[i]);
        }

    }
}
